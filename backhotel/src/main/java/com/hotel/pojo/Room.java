package com.hotel.pojo;

import java.math.BigDecimal;
import lombok.Data;

/**
 * <p>
 * 房间信息
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data

public class Room  {

    private static final long serialVersionUID = 1L;

    /**
     * 房号
     */
    private String roomNumber;

    /**
     * 1入住 2空闲 3预定
     */
    private Integer state;

    /**
     * 标准价
     */
    private BigDecimal standardPrice;

    /**
     * 折后价
     */
    private BigDecimal discountPrice;

    /**
     * 普通会员价
     */
    private BigDecimal ncustomerPrice;

    /**
     * VIP会员价
     */
    private BigDecimal vcustomerPrice;

    /**
     * 备注
     */
    private String note;


}
