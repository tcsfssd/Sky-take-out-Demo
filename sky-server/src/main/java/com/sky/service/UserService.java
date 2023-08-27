package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @Author: IT-ztc
 * @DATE: 2023/8/27
 * @PROJECT_NAME: sky-take-out
 **/
public interface UserService {
    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
