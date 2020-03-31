package com.self.study_japanese.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.self.study_japanese.dto.SysUserDTO;
import com.self.study_japanese.pojo.Kana;
import com.self.study_japanese.pojo.SysUser;
import com.self.study_japanese.service.KanaService;
import com.self.study_japanese.service.SysUserService;
import com.self.study_japanese.utils.R;
import com.self.study_japanese.utils.RedisUtils;
import com.self.study_japanese.utils.ShiroUtils;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class SysUserController {


    @Autowired
    private DefaultKaptcha kaptcha;

    @Autowired
    private KanaService kanaService;

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response){
        // 缓存设置-设置不缓存（可选操作）
        response.setHeader("Cache-Control","no-store, no-cache");
        // 设置响应内容
        response.setContentType("image/jpg");
        //生成验证码
        String text = kaptcha.createText();//文本
        //生成图片
        BufferedImage image = kaptcha.createImage(text);
        //验证码存储到shiro的 session
        ShiroUtils.setKaptcha(text);
        try {
            //返回到页面
            ServletOutputStream outputStream = response.getOutputStream();
            ImageIO.write(image,"jpg",outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/SysUserLogin")
    @ResponseBody
    public R SysUserLogin(@RequestBody SysUserDTO userDTO){
        if (userDTO.getCaptcha()==null || "".equals(userDTO.getCaptcha())){
            return R.error("验证码不能为空");
        }
        if (!userDTO.getCaptcha().equals(ShiroUtils.getKaptcha())){
            return R.error("验证码错误");
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userDTO.getUsername(), userDTO.getPassword());
        usernamePasswordToken.setRememberMe(userDTO.isRememberMe());
        try{
            subject.login(usernamePasswordToken);
            subject.getSession().setAttribute("user",sysUserService.findUserByUsername(userDTO.getUsername()));
            return R.ok();
        }catch (UnknownAccountException e){
            return R.error("用户名不存在");
        }catch (IncorrectCredentialsException e){
            return R.error("密码错误");
        }
    }

    @RequestMapping("/getKana")
    @ResponseBody
    public R getKana(){
        Kana kana = kanaService.getKana();
        SysUser user = (SysUser) SecurityUtils.getSubject().getSession().getAttribute("user");
        Map<String,Object> data = new HashMap<>();
        data.put("kana",kana.getKana());
        data.put("kanaID",kana.getKid());
        data.put("userID",user.getUid());
        return R.ok(data);
    }
}
