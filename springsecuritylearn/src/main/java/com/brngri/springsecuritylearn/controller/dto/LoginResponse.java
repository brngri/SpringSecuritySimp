package com.brngri.springsecuritylearn.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
    
}
