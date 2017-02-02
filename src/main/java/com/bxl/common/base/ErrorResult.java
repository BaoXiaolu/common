/*
 * commons - com.bxl.commons.base - ErrorResult        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/2
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 用以响应错误的请求对象
 *
 * @since 1.0.0
 */
public class ErrorResult extends Result {
    /**
     * 封装多个 错误信息
     */
    private Map<String, Object> errors = new HashMap<String, Object>();

    public Map<String, Object> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }

    public ErrorResult() {

    }
}
