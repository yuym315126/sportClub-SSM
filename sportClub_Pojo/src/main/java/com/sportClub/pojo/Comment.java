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
public class Comment implements Serializable {
    /**
    * 打卡详情表下的评论id
    */
    private Integer commentId;

    /**
    * 打卡id
    */
    private Integer punchcardId;

    /**
    * 动态/说说Id
    */
    private Integer talkId;

    /**
    * 评论内容
    */
    private String commentContent;

    /**
    * 该评论的点赞数
    */
    private Integer commentLikeCount;

    /**
    * 评论的用户id
    */
    private Integer userId;

    /**
    * 评论时间
    */
    private Date commentTime;

    /**
    * 评论类型，1打卡评论 2动态/说说评论
    */
    private Integer commentType;

    private static final long serialVersionUID = 1L;
}