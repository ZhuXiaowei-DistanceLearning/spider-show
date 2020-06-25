package com.zxw.common.aspect;

import com.zxw.common.annotation.IPLimit;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zxw
 * @date 2020/6/25 17:48
 */
@Aspect
@Component
public class LimitAspect {
    @Before("within(@org.springframework.stereotype.Controller *) && @annotation(limit)")
    public void requestLimit(final JoinPoint joinPoint, IPLimit limit){

    }
}
