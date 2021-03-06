package com.sun.improve.mybatis.service;

import com.sun.improve.mybatis.entity.File;
import com.sun.improve.mybatis.entity.Message;
import com.sun.improve.mybatis.entity.User;
import com.sun.improve.mybatis.mapper.MessageMapper;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : sunshaocong
 * @date : 2021-03-06
 */
@Service
public class MessageService {
    private final MessageMapper messageMapper;

    public MessageService(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    public Message get(String id) {
        return messageMapper.selectById(id);
    }

    public int set() {
        Message message = new Message();
        message.setId(new ObjectId().toHexString());
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(new ObjectId().toHexString());
        user.setName("张三");
        user.setNameEn("zhangsan");
        user.setAvatar("http://www.baidu.com");
        List<File> files = new ArrayList<>();
        File file = new File();
        file.setId(new ObjectId().toHexString());
        file.setName("asdfghjkl");
        files.add(file);
        user.setFiles(files);
        users.add(user);
        message.setContent(users);
        return messageMapper.insert(message);
    }
}
