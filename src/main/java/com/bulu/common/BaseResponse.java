package com.bulu.common;

import lombok.Builder;
import lombok.Data;

/**
 * @author chevysky
 * 基础相应model
 */
@Data
@Builder
public class BaseResponse {

    private boolean success;

    private Object data;

    private String error;

}
