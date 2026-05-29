package com.itbaizhan.farm_common.exception;

import com.itbaizhan.farm_common.result.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 自定义异常类
 */
@Data
@AllArgsConstructor
public class BusException extends RuntimeException {
    // 状态码 + 错误信息
    private CodeEnum codeEnum;

}
