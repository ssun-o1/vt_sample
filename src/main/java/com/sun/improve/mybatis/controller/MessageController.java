package com.sun.improve.mybatis.controller;

import com.sun.improve.common.CommonResponse;
import com.sun.improve.mybatis.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : sunshaocong
 * @date : 2021-03-06
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("get")
    public ResponseEntity<?> get(String id) {
        return CommonResponse.success(messageService.get(id));
    }

    @GetMapping("set")
    public ResponseEntity<?> set() {
        return CommonResponse.success(messageService.set());
    }
}
