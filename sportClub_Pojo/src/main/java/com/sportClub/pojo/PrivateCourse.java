package com.sportClub.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: 破晓
 * @date: 2020/8/20 21:49
 * @description:
 */
    
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivateCourse implements Serializable {
    /**
    * 私教课Id
    */
    private Integer privateCourseId;

    /**
    * 私教课内容
    */
    private String privateCourseContent;

    /**
    * 私教课价格
    */
    private Double privateCourseMoney;

    /**
    * 私教课节数
    */
    private Integer privateCoursePitchuNum;

    /**
    * 单节时间（分钟为单位）
    */
    private Integer privateCourseOnceTime;

    /**
    * 创建时间
    */
    private Date privateCourseCreatTime;

    /**
    * 私教课状态（1为开启状态，0为关闭状态）
    */
    private Integer privateCourseStatus;

    private static final long serialVersionUID = 1L;
}