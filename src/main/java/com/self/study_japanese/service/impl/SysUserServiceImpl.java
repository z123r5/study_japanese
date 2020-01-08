package com.self.study_japanese.service.impl;

import com.self.study_japanese.dao.SysUserMapper;
import com.self.study_japanese.pojo.SysUser;
import com.self.study_japanese.pojo.SysUserExample;
import com.self.study_japanese.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserByUsername(String username) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        if (sysUsers!=null && sysUsers.size()>0){
            return sysUsers.get(0);
        }
        return null;
    }
}
