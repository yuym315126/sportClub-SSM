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
public class OrderType implements Serializable {
    /**
    * 订单类型Id
    */
    private Integer orderTypeId;

    /**
    * 订单类型详情 1商城订单 2私教课订单 3奖品订单
    */
    private String orderTypeContent;

    private static final long serialVersionUID = 1L;
}