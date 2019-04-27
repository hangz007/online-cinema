package com.stylefeng.guns.rest.common;

import com.stylefeng.guns.api.user.UserInfoModel;

public class CurrentUser {

    // 线程绑定
    private static  final ThreadLocal<String> threadLocal = new ThreadLocal<>() ;

        public static void saveUserId(String userId) {
        threadLocal.set(userId);
    }

        // 将用户信息取出
    public static String getCurrentUser() {
        return threadLocal.get();
    }

//    // 将用户信息放入存储文件
//    public static void saveUserInfo(UserInfoModel userInfoModel) {
//        threadLocal.set(userInfoModel);
//    }
//
//    // 将用户信息取出
//    public static UserInfoModel getCurrentUser() {
//        return threadLocal.get();
//    }






}
