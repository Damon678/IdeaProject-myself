package com.hotel.pojo;

import java.math.BigDecimal;
import lombok.Data;


/**
 * <p>
 * 退房登记
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class Checkout {

    private static final long serialVersionUID = 1L;

    /**
     * 入住单号
     */
    private String no;

    /**
     * 房价
     */
    private BigDecimal discountPrice;

    /**
     * 押金
     */
    private BigDecimal deposit;

    /**
     * 天数
     */
    private Integer days;

    /**
     * 住宿费
     */
    private BigDecimal hotelCost;

    /**
     * 店内消费
     */
    private BigDecimal shopCost;

    /**
     * 餐费
     */
    private BigDecimal mealCost;

    /**
     * 电话费
     */
    private BigDecimal phoneCost;

    /**
     * 实际应收
     */
    private BigDecimal realCost;

    /**
     * 应退押金
     */
    private BigDecimal reDeposit;

    /**
     * 1现金2在线3刷卡
     */
    private Integer paymentType;

    /**
     * 实收
     */
    private BigDecimal receivedMoney;

    /**
     * 找零
     */
    private BigDecimal changex;

    /**
     * 操作员id
     */
    private Integer userId;

    /**
     * 备注
     */
    private String note;


}
