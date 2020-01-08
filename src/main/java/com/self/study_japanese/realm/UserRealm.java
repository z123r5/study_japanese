package com.self.study_japanese.realm;

import com.self.study_japanese.pojo.SysUser;
import com.self.study_japanese.service.SysUserService;
import com.self.study_japanese.utils.MD5Utils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Service;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;
    /**
     * 认证逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 授权逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        SysUser userInDataSource = sysUserService.findUserByUsername(usernamePasswordToken.getUsername());
        if (userInDataSource == null){
            throw new UnknownAccountException();
        }
        String password = MD5Utils.md5(new String(usernamePasswordToken.getPassword()),usernamePasswordToken.getUsername().substring(0,3),1024);
        usernamePasswordToken.setPassword(password.toCharArray());
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userInDataSource, userInDataSource.getPassword(), getName());
        return simpleAuthenticationInfo;
    }
}
