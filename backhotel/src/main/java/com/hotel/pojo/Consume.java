package com.hotel.pojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;


/**
 * <p>
 * 消费信息
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class Consume  {

    private static final long serialVersionUID = 1L;

    /**
     * 入住单号
     */
    private String no;

    /**
     * 房间号
     */
    private String roomNumber;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 单价
     */
    private BigDecimal goodsPrice;

    /**
     * 消费金额
     */
    private BigDecimal consumeMoney;

    /**
     * 折扣率
     */
    private BigDecimal discountRate;

    /**
     * 折后金额
     */
    private BigDecimal discountMoney;

    /**
     * 合计
     */
    private BigDecimal sumMoney;

    /**
     * 操作员
     */
    private Integer userId;

    /**
     * 消费时间
     */
    private LocalDateTime date;

    /**
     * 备注
     */
    private String note;


}
