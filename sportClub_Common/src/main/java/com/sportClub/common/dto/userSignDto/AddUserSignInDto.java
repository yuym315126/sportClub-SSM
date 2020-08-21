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
public class AddUserSignInDto {


    /**
     * 连续签到天数
     */
    private Integer signCountDays;

    /**
     * 签到时间
     */
    private Date signDatetime;
}
