/*
 * commons - com.bxl.commons.base - CustomException        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/2
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.commons.base;

/**
 * 用户自定义异常
 *
 * @since 1.0.0
 */
public class CustomException extends RuntimeException {
    /**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();

    public long getDate() {
        return date;
    }
}
