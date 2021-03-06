package com.sun.improve.mybatis.entity;

import lombok.Data;

import java.util.List;

/**
 * @author : sunshaocong
 * @date : 2021-03-06
 */
@Data
public class User {
    private String id;
    private String name;
    private String nameEn;
    private String avatar;
    private List<File> files;
}
