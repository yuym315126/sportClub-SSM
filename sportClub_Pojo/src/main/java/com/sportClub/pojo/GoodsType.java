package com.sportClub.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 破晓
 * @date: 2020/8/20 21:49
 * @description:
 */
    
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsType implements Serializable {
    /**
    * 商品类型id
    */
    private Integer goodsTypeId;

    /**
    * 商品类型名
    */
    private String goodsTypeName;

    /**
    * 如果该目录为一级目录则该值为0，如果该目录为二级目录，则值为对应的一级目录的id
    */
    private Integer goodsControlValue;

    private static final long serialVersionUID = 1L;
}