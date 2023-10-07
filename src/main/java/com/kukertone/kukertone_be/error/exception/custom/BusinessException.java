package com.kukertone.kukertone_be.error.exception.custom;

import com.kukertone.kukertone_be.error.ErrorCode;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{

    private final int code;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }
}
