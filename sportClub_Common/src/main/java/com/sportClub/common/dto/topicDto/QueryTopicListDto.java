package com.sportClub.common.dto.topicDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 张浩洋
 * @date: 2020-08-22
 * @description: 查询话题信息Dto，查询后的结果封装为 List 集合
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryTopicListDto {
    // 话题id
    private Integer topicId;

    // 话题名
    private String topicName;

    // 话题图片地址
    private String topicImgUrl;
}
