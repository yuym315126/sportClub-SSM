package com.sportClub.provider.dao;

import com.sportClub.common.dto.topicDto.QueryOneTopicDto;
import com.sportClub.common.dto.topicDto.QueryTopicListDto;
import com.sportClub.pojo.UserSign;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("topicDao")
public interface TopicDao {
    List<QueryTopicListDto> queryTopicList();

    QueryOneTopicDto queryTopicByTopicId(Integer topicId);
}
