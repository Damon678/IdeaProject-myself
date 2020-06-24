package com.hotel.pojo;

import java.math.BigDecimal;
import lombok.Data;


/**
 * <p>
 * 商品信息
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class Goods {

    private static final long serialVersionUID = 1L;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品类别id
     */
    private Integer goodsTypeId;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 单位
     */
    private String unit;

    /**
     * 备注
     */
    private String note;


}
