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
public class OrderStatus implements Serializable {
    /**
    * 订单状态Id
    */
    private Integer orderStatusId;

    /**
    * 订单状态详情 1待付款 2代发货 3已发货 4已完成 5已取消 
    */
    private String orderStatusContent;

    private static final long serialVersionUID = 1L;
}