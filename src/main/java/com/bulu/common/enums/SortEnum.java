package com.bulu.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author chevysky
 */
@Getter
@AllArgsConstructor
public enum SortEnum {

    /**
     * 用于sql查询 ORDER BY
     */
    DESC("DESC", "降序"),

    ASC("ASC", "升序"),
    ;

    private String code;

    private String desc;
}
