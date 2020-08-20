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
public class GoodsStatus implements Serializable {
    /**
    * 商品状态Id
    */
    private Integer goodsStatusId;

    /**
    * 商品状态
    */
    private String goodsStatus;

    private static final long serialVersionUID = 1L;
}