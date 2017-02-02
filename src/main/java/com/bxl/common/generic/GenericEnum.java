/*
 * commons - com.bxl.commons.generic - GenericEnum        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/1
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.generic;

import java.io.Serializable;

/**
 * 枚举Fake抽象类.
 * 以pojo类代替枚举对象进行操作.
 *
 * @param <T> 枚举值类型
 */
public abstract class GenericEnum<T> implements Serializable {
    /**
     * 枚举文本
     */
    private String text;
    /**
     * 枚举值
     */
    private T value;
    /**
     * 枚举描述
     */
    private String description;

    /**
     *
     * @param text 枚举文本
     * @param value 枚举值
     * @param description 枚举描述
     */
    public GenericEnum(String text, T value, String description) {
        this.text = text;
        this.value = value;
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public T getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
