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
public class UserOntimeCourse implements Serializable {
    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 累计健身时间（单位：分钟）
    */
    private Integer fitnessTime;

    private static final long serialVersionUID = 1L;
}