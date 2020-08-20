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
public class BalanceLog implements Serializable {
    /**
    * 钱包记录日志Id
    */
    private Integer balanceLogId;

    /**
    * 用户Id
    */
    private Integer userId;

    /**
    * 钱包记录日志
    */
    private String balanceLog;

    private static final long serialVersionUID = 1L;
}