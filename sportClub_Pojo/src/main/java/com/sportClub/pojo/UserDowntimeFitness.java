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
public class UserDowntimeFitness implements Serializable {
    /**
    * 健身记录Id，此为线下健身房健身记录
    */
    private Integer fitnessRecordId;

    /**
    * 用户Id
    */
    private Integer userId;

    /**
    * 健身开始时间
    */
    private Date fitnessStartTime;

    /**
    * 健身结束时间
    */
    private Date fitnessEndTime;

    /**
    * 健身房Id
    */
    private Integer fitnessRoomId;

    private static final long serialVersionUID = 1L;
}