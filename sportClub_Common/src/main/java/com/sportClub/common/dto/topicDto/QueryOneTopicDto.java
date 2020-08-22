package com.sportClub.common.dto.topicDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 张浩洋
 * @date: 2020-08-22
 * @description: 查询单个话题信息的 dto
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryOneTopicDto {
    // 话题Id
    private Integer topicId;

    // 话题名
    private String topicName;

    // 话题内容
    private String topicContent;

    // 话题参与的用户数
    private Integer userCount;

    // 话题下的动态数
    private Integer talkCount;
}
