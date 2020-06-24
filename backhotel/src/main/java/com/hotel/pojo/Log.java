package com.hotel.pojo;

import java.time.LocalDateTime;
import lombok.Data;


/**
 * <p>
 * 日志表
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class Log {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 操作
     */
    private String operation;

    /**
     * 密码
     */
    private String password;

    /**
     * 操作时间
     */
    private LocalDateTime time;

    /**
     * 备注
     */
    private String note;


}
