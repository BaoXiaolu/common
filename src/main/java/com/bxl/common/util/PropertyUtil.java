/*
 * common - com.bxl.common.util - PropertyUtil        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/2
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.util;

import java.io.*;
import java.util.Properties;

/**
 * 配置文件操作工具类.<p>
 * 认属性文件的路径为 application-config.properties
 *
 * @since 1.0.0
 */
public class PropertyUtil implements Serializable {
    // 默认属性文件的路径
    static String proFilePath="application-config.properties";

    /**
     * 采用静态方法
     */
    private static Properties props = new Properties();
    static {
        try {
//            props.load(new FileInputStream(proFilePath));
            props.load(PropertyUtil.class.getClassLoader().getResourceAsStream(proFilePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(-1);
        } catch (IOException e) {
            System.exit(-1);
        }
    }

    /**
     * 读取属性文件中相应键的值
     * @param key 主键
     * @return String
     */
    public static String getKeyValue(String key) {
        return props.getProperty(key);
    }

    /**
     * 根据主键key读取主键的值value
     *
     * @param filePath 属性文件路径
     * @param key 键名
     */
    public static String readValue(String filePath, String key) {
        Properties props = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(
                    filePath));
            props.load(in);
            String value = props.getProperty(key);
            //System.out.println(key +"键的值是："+ value);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
