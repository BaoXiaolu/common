/*
 * commons - com.bxl.commons.base - JSONResult        
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
 * Response JSONResult for RESTful,封装返回JSON格式的数据.
 *
 * @param <T> 返回结果模型
 */
public class JSONResult<T> extends Result {
    /**
     * 数据
     */
    private T data;

    /**
     * 自定义返回的结果
     *
     * @param data 数据
     * @param message 响应消息
     * @param success 操作结果
     */
    public JSONResult(T data, String message, boolean success) {
        this.data = data;
        super.setMessage(message);
        super.setSuccess(success);
    }

    /**
     * 成功返回数据和消息
     *
     * @param data 数据
     * @param message 响应消息
     */
    public JSONResult(T data, String message) {
        this.data = data;

        super.setMessage(message);
        super.setSuccess(true);
        super.setStatusCode(GenericResultCode.SUCCESS.getValue());
    }

    /**
     * 成功返回数据
     *
     * @param data 数据
     */
    public JSONResult(T data) {
        this.data = data;

        super.setSuccess(true);
        super.setStatusCode(GenericResultCode.SUCCESS.getValue());
        super.setMessage(GenericResultCode.SUCCESS.getDescription());
    }
}
