package com.bulu.common.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author chevysky
 */
@Data
@Builder
public class PageListVO {

    private Long total;

    private Object list;
}
