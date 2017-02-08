/*
 * common - com.bxl.common.util - ApplicationContextProvider        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/8
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring 上下文提供者
 * <br>
 *     how to use:
 *     <pre>
 *         TestBean tb = ApplicationContextProvider.getApplicationContext().getBean(TestBean.class);
 *     </pre>
 *
 * @since 1.1.0
 */
public class ApplicationContextProvider implements ApplicationContextAware {

    private static ApplicationContext context;

    public static ApplicationContext getApplicationContext() { return context; }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
