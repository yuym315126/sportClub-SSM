package com.sportClub.web.controller;

import com.sportClub.common.vo.R;
import com.sportClub.provider.service.TopicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("topic")
public class TopicController {

    @Resource
    private TopicService topicService;

    @GetMapping("queryTopicList")
    public R queryTopicList(){
        return topicService.queryTopicList();
    }

}
