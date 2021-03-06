package com.sun.improve.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.improve.mybatis.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author : sunshaocong
 * @date : 2021-03-06
 */
@Mapper
@Repository
public interface MessageMapper extends BaseMapper<Message> {

}
