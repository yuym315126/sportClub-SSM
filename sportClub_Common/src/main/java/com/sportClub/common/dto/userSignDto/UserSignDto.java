package com.sportClub.common.dto.userSignDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: 破晓
 * @date: 2020/8/21 19:04
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSignDto {
    /**
     * 签到id
     */
    private Integer signId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 签到时间
     */
    private Date signDatetime;
}
