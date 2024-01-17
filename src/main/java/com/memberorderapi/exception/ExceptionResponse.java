package com.memberorderapi.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExceptionResponse {
    int statusCode;
    String message;
}
