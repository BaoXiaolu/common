/*
 * commons - com.bxl.commons.generic - GenericService
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/1
 * <p>
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.generic;

import java.util.List;

/**
 * 所有自定义Service的顶级接口,封装常用的增删查改操作.
 *
 * @param <Model> 数据库映射的Java对象
 * @param <PK> 主键类型
 * @since 1.0.0
 */
public interface GenericService<Model, PK>  {
    /**
     * 插入对象
     *
     * @param model 对象
     * @return 影响记录数
     */
    int insert(Model model);

    /**
     * 更新对象
     *
     * @param model 对象
     * @return 影响记录数
     */
    int update(Model model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     * @return 影响记录数
     */
    int delete(PK id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return model 对象
     */
    Model selectById(PK id);

    /**
     * 查询所有对象
     *
     * @return 对象集合
     */
    List<Model> selectAll();
}
