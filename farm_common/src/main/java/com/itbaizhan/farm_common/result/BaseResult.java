package com.itbaizhan.farm_common.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 统一返回结果类
 */
@Data
@AllArgsConstructor
public class BaseResult <T> {
    // 状态码(成功:200 失败:其他)
    private Integer code;
    // 提示消息
    private String message;
    // 返回数据
    private T data;

    // 构建成功结果
    public static <T> BaseResult<T> ok() {
        return new BaseResult(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), null);
    }

    // 构建带有数据的成功结果
    public static <T> BaseResult<T> ok(T data) {
        return new BaseResult(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), data);
    }

    // 构建失败结果
    public static <T> BaseResult<T> error(CodeEnum codeEnum) {
        return new BaseResult(codeEnum.getCode(), codeEnum.getMessage(),null);
    }

    // 构建带有数据的失败结果
    public static <T> BaseResult<T> error(CodeEnum codeEnum, T data) {
        return new BaseResult(codeEnum.getCode(), codeEnum.getMessage(),data);
    }
}
