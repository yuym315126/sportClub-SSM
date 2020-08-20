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
public class CoachCourseList implements Serializable {
    /**
    * 教练Id
    */
    private Integer userId;

    /**
    * 私教课Id
    */
    private Integer privateCourseId;

    private static final long serialVersionUID = 1L;
}