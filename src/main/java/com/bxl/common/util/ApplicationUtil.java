/*
 * common - com.bxl.common.util - ApplicationUtil        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/2
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.util;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 程序工具类，提供一些便捷方法
 *
 * @since 1.0.0
 */
public class ApplicationUtil implements Serializable{
    /**
     * 产生一个36个字符的UUID
     *
     * @return UUID
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * 产生一个不包含"-"的UUID
     * @return
     */
    public static String randomUUIDStr() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 获取当前时间戳
     *
     * @return
     */
    public static Timestamp currentTime() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T,Object> keyExtractor) {
        Map<Object,String> seen = new ConcurrentHashMap<>();
        return t -> seen.put(keyExtractor.apply(t), "") == null;
    }
}
