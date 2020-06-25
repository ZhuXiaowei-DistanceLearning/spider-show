package com.zxw.common.exception.handler;

import com.zxw.common.exception.base.ApiResult;
import com.zxw.common.exception.base.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author zxw
 * @date 2020/6/25 17:08
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ApiResult> handleException(BaseException e) {
        return ResponseEntity.status(e.getExceptionEnums().getCode()).body(new ApiResult(e.getExceptionEnums()));
    }
}
