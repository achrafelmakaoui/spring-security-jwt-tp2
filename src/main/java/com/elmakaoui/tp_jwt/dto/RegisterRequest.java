package com.elmakaoui.tp_jwt.dto;

public record RegisterRequest(
        String email,
        String password
) {
}
