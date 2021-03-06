package com.sun.improve.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author : sunshaocong
 * @date : 2021-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "message",autoResultMap = true)
public class Message extends Model<Message> implements Serializable {
    private String id;
    @TableField(value = "content",typeHandler = FastjsonTypeHandler.class)
    private List<User> content;
}
