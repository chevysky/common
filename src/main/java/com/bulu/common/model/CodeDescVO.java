package com.bulu.common.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author chevysky
 * 基本枚举返回给前端用的
 */
@Builder
@Data
public class CodeDescVO {

    private String code;

    private String desc;
}
