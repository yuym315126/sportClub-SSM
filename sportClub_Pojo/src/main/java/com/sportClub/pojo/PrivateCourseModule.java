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
public class PrivateCourseModule implements Serializable {
    /**
    * 学员id
    */
    private Integer userIdStudent;

    /**
    * 教练id
    */
    private Integer userIdCoach;

    /**
    * 私教课id
    */
    private String privateCourseId;

    private static final long serialVersionUID = 1L;
}