package com.signify.OnlineSystemApplication.services;
import com.signify.OnlineSystemApplication.entity.UserInfo;

public interface UserServices {

    UserInfo saveUser(UserInfo userInfo);
    UserInfo getUserById(Long userId);
    UserInfo updateUser(Long userId, UserInfo userInfo);
    String deleteUserById(Long userId);
}

