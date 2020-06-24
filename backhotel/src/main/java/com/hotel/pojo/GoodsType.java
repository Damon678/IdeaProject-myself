package com.hotel.pojo;

import lombok.Data;

/**
 * <p>
 * 商品类别
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class GoodsType {

    private static final long serialVersionUID = 1L;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 备注
     */
    private String note;


}
