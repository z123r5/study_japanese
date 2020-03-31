package com.self.study_japanese.config;

import com.self.study_japanese.realm.UserRealm;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.RememberMeManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.Cookie;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisClusterManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    private static final String CACHE_KEY = "shiro:cache:";
    private static final String SESSION_KEY = "shiro:session:";
    private static final String NAME = "custom.name";
    private static final String VALUE = "/";

    /**
     * Redis集群使用RedisClusterManager，单个Redis使用RedisManager
     * @param redisProperties
     * @return
     */
    @Bean
    public RedisClusterManager redisManager(RedisProperties redisProperties) {
        RedisClusterManager redisManager = new RedisClusterManager();
        redisManager.setHost(redisProperties.getHost());
        redisManager.setPassword(redisProperties.getPassword());
        return redisManager;
    }

    @Bean
    public RedisCacheManager redisCacheManager(RedisClusterManager redisManager) {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager);
        redisCacheManager.setExpire(86400);
        redisCacheManager.setKeyPrefix(CACHE_KEY);
        return redisCacheManager;
    }

    @Bean
    public RedisSessionDAO redisSessionDAO(RedisClusterManager redisManager) {
        RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
        redisSessionDAO.setExpire(86400);
        redisSessionDAO.setKeyPrefix(SESSION_KEY);
        redisSessionDAO.setRedisManager(redisManager);
        return redisSessionDAO;
    }

    //1,创建 SessionManager 管理会话
    @Bean(name = "sessionManager")//<bean class="">
    public SessionManager sessionManager(){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        //设置过期时间
        sessionManager.setGlobalSessionTimeout(1000*60*30);
        //设置后台线程  清理过期的会话
        sessionManager.setSessionValidationSchedulerEnabled(true);
        //设置地址比拼接sessionid
        sessionManager.setSessionIdUrlRewritingEnabled(false);

        return sessionManager;
    }

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        /**
         *         添加shiro内置过滤器
         *          常用过滤器：
         *          anon 无需认证可访问
         *          authc 必须认证才可访问
         *          user 如果使用rememberMe功能可以访问
         *          perms 该资源必须得到资源权限才可以访问
         *          role 该资源必须得到角色权限
         */
        Map<String,String> filterMap = new LinkedHashMap<String,String>();
        filterMap.put("/*","user");
        filterMap.put("/login.html","anon");
        filterMap.put("/user/SysUserLogin","anon");
        filterMap.put("captcha.jpg","anon");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);

        //修改跳转的登录页面
        shiroFilterFactoryBean.setLoginUrl("/login.html");
        shiroFilterFactoryBean.setSuccessUrl("/index.html");
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized.html");

        return shiroFilterFactoryBean;
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm,@Qualifier("sessionManager") SessionManager sessionManager,@Qualifier("rememberMeManager") RememberMeManager rememberMeManager){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setSessionManager(sessionManager);
        //缓存管理
        EhCacheManager cacheManager = new EhCacheManager();
        cacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");
        //rememberMeManager
        defaultWebSecurityManager.setRememberMeManager(rememberMeManager);


        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;
    }

    @Bean(name = "userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

    //4,BeanLifeCycle  生命周期
    @Bean(name="lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        LifecycleBeanPostProcessor lifecycleBeanPostProcessor = new LifecycleBeanPostProcessor();
        return  lifecycleBeanPostProcessor;
    }

    //5,开启shiro的注解
    @Bean(name = "defaultAdvisorAutoProxyCreator")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);//cglib方式
        return  defaultAdvisorAutoProxyCreator;
    }


    @Bean(name = "rememberMeManager")
    public CookieRememberMeManager rememberMeManager(@Qualifier("rememberMeCookie")SimpleCookie rememberMeCookie){
        CookieRememberMeManager rememberMeManager = new CookieRememberMeManager();
        rememberMeManager.setCookie(rememberMeCookie);
        return rememberMeManager;
    }

    @Bean(name = "rememberMeCookie")
    public SimpleCookie sessionIdCookie(){
        SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
        simpleCookie.setHttpOnly(true);
        simpleCookie.setMaxAge(2592000);
        return simpleCookie;
    }

    @Bean(name = "sessionIdCookie")
    public SimpleCookie simpleCookie(){
        SimpleCookie simpleCookie = new SimpleCookie("sid");
        simpleCookie.setHttpOnly(true);
        simpleCookie.setMaxAge(-1);
        return simpleCookie;
    }

}
