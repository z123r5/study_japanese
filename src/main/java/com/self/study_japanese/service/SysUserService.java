package com.self.study_japanese.service;

import com.self.study_japanese.pojo.SysUser;

public interface SysUserService {

    SysUser findUserByUsername(String username);
}
