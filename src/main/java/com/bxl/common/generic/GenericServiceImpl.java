/*
 * commons - com.bxl.commons.generic - GenericServiceImpl        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/1
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.generic;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public abstract class GenericServiceImpl<Model, PK> implements GenericService<Model, PK> {

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     *
     * @return GenericDao实现类
     */
    public abstract GenericDao<Model, PK> getDao();

    /**
     * 插入对象.<p>
     * 使用选择性插入实现.<p>
     * 参数对象为空的列将不会插入值.如果数据库列设置了默认值则取默认值,否则列值是空. <p>
     * 对于列不允许为空情况-则需要人为确保调用该方法时不为空列确保有值使插入不报错.
     *
     * @param model 对象
     * @return 影响记录数
     */
    public int insert(Model model) {
        return getDao().insertSelective(model);
    }

    /**
     * 根据主键选择性更新对象.<p>
     * 按照主键修改一行数据.该方法会更新表中参数对象属性不为空的列.该方法可以被使用更新某些特定的列而不影响所有列数据.
     *
     * @param model 对象
     * @return 影响记录数
     */
    public int update(Model model) {
        return getDao().updateByPrimaryKeySelective(model);
    }

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     * @return 影响记录数
     */
    public int delete(PK id) {
        return getDao().deleteByPrimaryKey(id);
    }

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    public Model selectById(PK id) {
        return getDao().selectByPrimaryKey(id);
    }

    /**
     * 查询所有对象
     *
     * @return 对象集合
     */
    public List<Model> selectAll() {
        throw new NotImplementedException();
    }
}
