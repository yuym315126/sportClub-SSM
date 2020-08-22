package com.sportClub.common.dto.topicDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 张浩洋
 * @date: 2020-08-22
 * @description: 添加话题信息所使用的 dto
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertTopicDto {
    // 话题名
    private String topicName;

    // 话题内容
    private String topicContent;

    // 话题图片地址
    private String topicImgUrl;
}
