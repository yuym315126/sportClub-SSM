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
public class Talk implements Serializable {
    /**
    * 话题下的动态/说说Id
    */
    private Integer talkId;

    /**
    * 动态/说说的内容
    */
    private String talkContent;

    /**
    * 动态/说说的图片地址
    */
    private String talkPicUrl;

    /**
    * 动态/说说创建的时间
    */
    private Date talkCreatTime;

    /**
    * 用户id，表明是哪个用户发表的动态/说说
    */
    private Integer userId;

    /**
    * 点赞数
    */
    private Integer talkLikeNum;

    private static final long serialVersionUID = 1L;
}