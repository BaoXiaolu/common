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
 * Spring 上下文提供者.
 * 提供手动从Spring上下文中获取Bean的支持.
 * <br>
 *     how to define:
 *     <pre>
 *         &lt;bean class="com.bxl.common.util.ApplicationContextProvider"  lazy-init="false" /&gt;
 *     </pre>
 *     <br>
 *     how to use:
 *     <pre>
 *         TestBean tb = ApplicationContextProvider.getApplicationContext().getBean(TestBean.class);
 *     </pre>
 *
 * @since 1.1.0
 */
public class ApplicationContextProvider implements ApplicationContextAware {

    private static ApplicationContext context;

    public static ApplicationContext getApplicationContext() {
        checkApplicationContext();
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }

    private static void checkApplicationContext() {
        if (context == null)
            throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义ApplicationContextProvider");
    }
}
