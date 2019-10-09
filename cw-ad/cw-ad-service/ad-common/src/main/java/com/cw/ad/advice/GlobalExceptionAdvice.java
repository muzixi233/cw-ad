package com.cw.ad.advice;

import com.cw.ad.exception.AdException;
import com.cw.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cw
 * @version 1.0
 * @date 2019/9/29 22:28
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req,
                                                     AdException ex){
CommonResponse<String> response = new CommonResponse<>(-1,
        "business error");
        response.setData(ex.getMessage());
        return response;
    }
}
