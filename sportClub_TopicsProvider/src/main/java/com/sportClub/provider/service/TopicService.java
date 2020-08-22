package com.sportClub.provider.service;

import com.sportClub.common.vo.R;

public interface TopicService {
    R queryTopicList();

    R queryTopicByTopicId(Integer topicId);
}
