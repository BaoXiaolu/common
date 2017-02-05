/*
 * common - com.bxl.common.feature.test - TestSupport        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/2
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.feature.test;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * 测试基类，编写测试类时继承该类
 *
 * @since 1.0.0
 */
public abstract class TestSupport {
    protected Logger logger = Logger.getLogger(this.getClass().getName());
    private ObjectMapper mapper = new ObjectMapper();

    protected long startTime;
    protected long endTime;

    /**
     * 记录 开始运行时间
     *
     * @return
     */
    protected long start() {
        this.startTime = System.currentTimeMillis();
        return startTime;
    }

    /**
     * 记录 结束运行时间
     *
     * @return
     */
    protected long end() {
        this.endTime = System.currentTimeMillis();
        this.log();
        return endTime;
    }

    /**
     * 输出记录
     */
    protected void log() {
        String text = "\n开始时间 : " + this.startTime + "\n结束时间 : " + this.endTime + "\n执行时间 : " + (this.endTime - this.startTime);
        logger.info(text);
    }

    /**
     * 将java对象转换成JSON字符串并输出
     * @param o 要
     * @throws IOException
     */
    protected void writeValueAsString(Object o) throws IOException {
        logger.info( mapper.writeValueAsString(o));
    }
}
