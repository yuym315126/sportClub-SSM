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
public class Shop implements Serializable {
    /**
    * 门店Id
    */
    private Integer shopId;

    /**
    * 门店名
    */
    private String shopName;

    /**
    * 门店地址
    */
    private String shopAddress;

    /**
    * 门店图
    */
    private String shopImgUrl;

    /**
    * 门店电话
    */
    private String shopPhone;

    private static final long serialVersionUID = 1L;
}