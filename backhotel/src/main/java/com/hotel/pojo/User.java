package com.hotel.pojo;

import lombok.Data;


/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class User {

    private static final long serialVersionUID = 1L;

    /**
     * 登录名
     */
    private String login;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 权限 1管理员 2经理 3前台
     */
    private Integer permissions;

    /**
     * 备注
     */
    private String note;


}
