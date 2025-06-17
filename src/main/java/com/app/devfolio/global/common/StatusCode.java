package com.app.devfolio.global.common;

import lombok.Getter;

@Getter
public enum StatusCode {
    // Success
    SUCCESS(true, 100, "요청에 성공하였습니다.");

    // COMMON


    // COMPANY : 400

    // BoardHelp, BoardTrade: 500


    // DELIVERY : 600


    private final boolean isSuccess;
    private final int code;
    private final String message;

    StatusCode(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
