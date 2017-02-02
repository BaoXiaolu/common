package com.bxl.common.base;

import com.bxl.common.generic.GenericEnum;

/**
 * 操作结果码
 *
 * @author Bao Xiaolu
 * @since 1.0.0s
 */
public final class GenericResultCode extends GenericEnum<Integer>{

    /**
     * 操作成功
     */
    public final static GenericResultCode SUCCESS = new GenericResultCode("Success", 1, "操作成功");

    /**
     * 操作引发错误
     */
    public final static GenericResultCode ERROR = new GenericResultCode("Error", 2, "操作引发错误");

    /**
     * 警告
     */
    public final static GenericResultCode WARNING = new GenericResultCode("Warning", 3, "警告");

    /**
     * 指定参数的数据不存在
     */
    public final static GenericResultCode QUERYNULL = new GenericResultCode("QueryNull", 4, "指定参数的数据不存在");

    /**
     * 参数错误
     */
    public final static GenericResultCode PARAMERROR = new GenericResultCode("ParamError", 5, "参数错误");

    /**
     * 当前用户权限不足，不能继续操作
     */
    public final static GenericResultCode PURVIEWLACK = new GenericResultCode("PurviewLack", 6, "当前用户权限不足，不能继续操作");

    /**
     * 非法操作
     */
    public final static GenericResultCode ILLEGALOPERATION = new GenericResultCode("IllegalOperation", 7, "非法操作");

    /**
     *
     * @param text 枚举文本
     * @param value 枚举值
     * @param description 枚举描述
     */
    private GenericResultCode(String text, Integer value, String description) {
        super(text, value, description);
    }
}
