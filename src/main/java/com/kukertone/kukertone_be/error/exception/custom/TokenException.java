package com.kukertone.kukertone_be.error.exception.custom;

import com.kukertone.kukertone_be.error.ErrorCode;

import lombok.Getter;

@Getter
public class TokenException extends RuntimeException{

    private final int code;

    public TokenException(final ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }
}