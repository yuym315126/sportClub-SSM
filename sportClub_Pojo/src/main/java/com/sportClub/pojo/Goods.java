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
public class Goods implements Serializable {
    /**
    * 商品Id
    */
    private Integer goodsId;

    /**
    * 商品类型二级目录Id
    */
    private Integer goodsTwoLv;

    /**
    * 商品图片地址
    */
    private String goodsImgUrl;

    /**
    * 商品库存
    */
    private Integer goodsCount;

    /**
    * 商品价格
    */
    private Double goodsPrice;

    /**
    * 商品折扣，小数表示，0.1即为1折，1即为全价
    */
    private Double goodsDiscountDouble;

    /**
    * 商品标题
    */
    private String goodsTitle;

    /**
    * 商品详情图地址
    */
    private String goodsContentImgUrl;

    /**
    * 商品状态id
    */
    private Integer goodsStatusId;

    /**
    * 商品销量
    */
    private Integer goodsSalesVolume;

    private static final long serialVersionUID = 1L;
}