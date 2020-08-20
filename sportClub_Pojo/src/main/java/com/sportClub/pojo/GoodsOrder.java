package com.sportClub.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: 破晓
 * @date: 2020/8/20 21:49
 * @description:
 */
    
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsOrder implements Serializable {
    /**
    * 订单Id
    */
    private Integer orderId;

    /**
    * 订单金额
    */
    private Double orderMoney;

    /**
    * 商品总数
    */
    private Integer goodsNum;

    /**
    * 订单状态id
    */
    private Integer goodsStatusId;

    /**
    * 支付方式 id
    */
    private Integer goodsPaytypeId;

    /**
    * 订单创建时间
    */
    private Date goodsCreatTime;

    /**
    * 下单用户
    */
    private Integer userId;

    /**
    * 订单发货地点
    */
    private String orderGoodsOut;

    /**
    * 订单收货地点
    */
    private String orderGoodsReception;

    private String orderPhone;

    private static final long serialVersionUID = 1L;
}