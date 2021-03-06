package com.jtj.web.aspect;

import com.jtj.web.common.AssetException;
import com.jtj.web.common.ResultCode;
import com.jtj.web.common.ResultDto;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2017/4/9 22:55 End.
 */
@ControllerAdvice
public class ResultExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultDto<Object> handle(Exception e){
        e.printStackTrace();
        if (e instanceof AssetException){
            AssetException exception = (AssetException) e;
            return exception.getResult();
        }
        return new ResultDto<>(ResultCode.UN_KNOWN_ERROR);
    }

}
