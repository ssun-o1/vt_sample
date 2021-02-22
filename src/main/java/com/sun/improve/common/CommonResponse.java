package com.sun.improve.common;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

@Data
public class CommonResponse<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public static <T> ResponseEntity<?> success(T data) {
        CommonResponse<T> commonResponse = new CommonResponse<>();
        HttpStatus status = HttpStatus.OK;
        commonResponse.setCode(status.value());
        commonResponse.setData(data);
        commonResponse.setMessage("ok");
        return new ResponseEntity<>(commonResponse, status);
    }

    public static <T> ResponseEntity<?> error(HttpStatus status, String msg) {
        CommonResponse<T> commonResponse = new CommonResponse<>();
        commonResponse.setCode(status.value());
        commonResponse.setMessage(msg);
        return new ResponseEntity<>(commonResponse, status);
    }
}
