package com.zxw.common.annotation;

/**
 * @author zxw
 * @date 2020/6/25 16:59
 */
public @interface IPLimit {
    long count() default Integer.MAX_VALUE;

    long time() default 60000;
}
