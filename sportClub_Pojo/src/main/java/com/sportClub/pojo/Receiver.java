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
public class Receiver implements Serializable {
    /**
    * 收货地址表id
    */
    private Integer receiverId;

    /**
    * 用户ID
    */
    private Integer userId;

    /**
    * 收货姓名
    */
    private String receiverName;

    /**
    * 收货人电话
    */
    private String receiverPhone;

    /**
    * 省份
    */
    private String receiverProvince;

    /**
    * 城市
    */
    private String receiverCity;

    /**
    * 区/县
    */
    private String receiverDistrict;

    /**
    * 详细地址
    */
    private String receiverAddress;

    /**
    * 默认地址，1默认地址，0非默认地址
    */
    private Integer receiverDefault;

    private static final long serialVersionUID = 1L;
}