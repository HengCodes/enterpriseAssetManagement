package com.jtj.web.aspect;

import com.jtj.web.common.AssetException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2017/4/9 20:16 End.
 */
@Deprecated
//@Aspect
//@Component
public class ResultAspect {


    @Pointcut("execution(* com.jtj.web.controller.*.*(..))")
    public void pointcut(){}

    @Around("pointcut()")
    public Object aroundMethod(ProceedingJoinPoint point){
        try {
            return point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            if (throwable instanceof AssetException){
                AssetException exception = (AssetException) throwable;
                return exception.getResult();
            }
        }
        return null;
    }

}
