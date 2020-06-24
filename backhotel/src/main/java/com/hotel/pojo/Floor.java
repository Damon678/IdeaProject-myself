package com.hotel.pojo;


import lombok.Data;


/**
 * <p>
 * 楼层信息
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class Floor {

    private static final long serialVersionUID = 1L;

    /**
     * 楼层名称
     */
    private String name;

    /**
     * 备注
     */
    private String note;


}
