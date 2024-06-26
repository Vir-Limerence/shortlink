package com.nageoffer.shortlink.admin.dto.resp;

import lombok.Builder;
import lombok.Data;

/**
 * 用户登录接口返回
 */
@Data
@Builder
public class UserLoginRespDTO {
    /**
     * 用户token
     */
    private String token;
}
