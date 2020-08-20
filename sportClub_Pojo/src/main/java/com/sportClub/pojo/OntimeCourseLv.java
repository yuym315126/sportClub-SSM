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
public class OntimeCourseLv implements Serializable {
    /**
    * 在线课程等级Id
    */
    private Integer courseLv;

    /**
    * 在线课程等级描述
    */
    private String courseName;

    private static final long serialVersionUID = 1L;
}