/*
 * commons - com.bxl.commons.generic - GenericDao
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/1
 * <p>
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.commons.generic;

/**
 * 所有自定义Dao的顶级接口, 封装常用的增删查改操作.
 *
 * @param <Model> 数据库映射的Java对象
 * @param <PK> 主键类型
 * @since 1.0.0
 */
public interface GenericDao<Model, PK> {
    /**
     * 选择性插入对象.<p>
     * 参数对象为空的列将不会插入值.如果数据库列设置了默认值则取默认值,否则列值是空. <p>
     * 对于列不允许为空情况-则需要人为确保调用该方法时不为空列确保有值使插入不报错.
     *
     * @param model 对象
     */
    int insertSelective(Model model);

    /**
     * 根据主键选择性更新对象.<p>
     * 按照主键修改一行数据.该方法会更新表中参数对象属性不为空的列.该方法可以被使用更新某些特定的列而不影响所有列数据.
     *
     * @param model 对象
     */
    int updateByPrimaryKeySelective(Model model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return
     */
    Model selectByPrimaryKey(PK id);
}
