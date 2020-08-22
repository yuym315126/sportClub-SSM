package com.sportClub.provider.service.impl;

import com.alibaba.fastjson.JSON;
import com.sportClub.common.config.RedisKeyConfig;
import com.sportClub.common.vo.R;
import com.sportClub.pojo.User;
import com.sportClub.pojo.UserSign;
import com.sportClub.provider.config.JedisCore;
import com.sportClub.provider.dao.TopicDao;
import com.sportClub.provider.service.TopicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;


@Service("topicService")
@Slf4j
public class TopicServiceImpl implements TopicService {

    @Resource
    private TopicDao topicDao;

    @Autowired
    private JedisCore jedisCore;

    /**
     * 查询所有话题
     *
     * @return 返回值为 R 类，包含响应数据、响应信息和响应状态码
     */
    @Override
    public R queryTopicList() {
        try {
            return R.ok(topicDao.queryTopicList());
        }catch (Exception e){
            log.error(e.getMessage());
            return R.fail("网络出错了，休息下吧");
        }
    }

    /**
     * 根据话题Id，查询话题信息
     *
     * @param topicId Integer类型，话题Id
     * @return 返回值为 R 类，包含响应数据、响应信息和响应状态码
     */
    @Override
    public R queryTopicByTopicId(Integer topicId) {
        try {
            return R.ok(topicDao.queryTopicByTopicId(topicId));
        }catch (Exception e){
            log.error(e.getMessage());
            return R.fail("网络出错了，休息下吧");
        }
    }
}
