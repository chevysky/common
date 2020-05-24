package com.bulu.common;

/**
 * @author chevysky
 */
public class BuildResponseUtil {

    public static BaseResponse ok(){
        return BaseResponse.builder().success(true).build();
    }

    public static BaseResponse ok(Object data){
        return BaseResponse.builder().success(true).data(data).build();
    }

    public static BaseResponse failure() {
        return BaseResponse.builder().success(false).build();
    }

    public static BaseResponse failure(String error) {
        return BaseResponse.builder().error(error).build();
    }
}
