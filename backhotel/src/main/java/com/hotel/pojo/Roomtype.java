package com.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 客房类型
 * </p>
 *
 * @author wangyu
 * @since 2020-06-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roomtype extends BasePojo{

    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 客房名称
     */
    private String name;

    /**
     * 额定人数
     */
    private Integer size;

    /**
     * 备注
     */
    private String note;


}
