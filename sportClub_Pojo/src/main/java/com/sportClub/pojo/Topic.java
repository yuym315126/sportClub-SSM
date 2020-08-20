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
public class Topic implements Serializable {
    /**
    * 话题Id
    */
    private Integer topicId;

    /**
    * 话题名
    */
    private String topicName;

    /**
    * 话题描述
    */
    private String topicDescribe;

    /**
    * 话题图片地址
    */
    private String topicPicUrl;

    /**
    * 话题创建时间
    */
    private Date topicCreatTime;

    /**
    * 话题结束时间
    */
    private Date topicEndTime;

    private static final long serialVersionUID = 1L;
}