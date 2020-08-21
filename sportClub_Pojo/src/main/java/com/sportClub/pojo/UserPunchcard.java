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
public class UserPunchcard implements Serializable {
    /**
    * 打卡id
    */
    private Integer punchcardId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 打卡内容
    */
    private String punchcardContent;

    /**
    * 打卡发表的图片
    */
    private String punchcardImgUrl;

    /**
    * 创建日期
    */
    private Date punchcardTime;

    /**
    * 本次打卡点赞数
    */
    private Integer punchcardLikeNum;

    private static final long serialVersionUID = 1L;
}