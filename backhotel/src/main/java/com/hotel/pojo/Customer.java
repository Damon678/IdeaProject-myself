package com.hotel.pojo;


import java.time.LocalDate;
import lombok.Data;


/**
 * <p>
 * 会员表
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class Customer{

    private static final long serialVersionUID = 1L;

    /**
     * 会员名称
     */
    private String name;

    /**
     * 0-男,1-女
     */
    private Integer sex;

    /**
     * 电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 积分
     */
    private Integer integra;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 最后一次入住时间
     */
    private LocalDate lastCtime;

    /**
     * 最后一次预定时间
     */
    private LocalDate lastRtime;

    /**
     * 备注
     */
    private String note;


}
