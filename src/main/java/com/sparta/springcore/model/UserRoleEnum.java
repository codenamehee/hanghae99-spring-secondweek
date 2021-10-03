package com.sparta.springcore.model;

// 자바의 enum : userroleenum 변수가 user/admin 둘 중 하나여야만 한다는 뜻.
public enum UserRoleEnum {
    USER(Authority.USER), // 사용자 권한
    ADMIN(Authority.ADMIN); // 관리자 권한

    private final String authority;

    UserRoleEnum(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return this.authority;
    }

    public static class Authority {
        public static final String USER = "ROLE_USER";
        public static final String ADMIN = "ROLE_ADMIN";
    }
}