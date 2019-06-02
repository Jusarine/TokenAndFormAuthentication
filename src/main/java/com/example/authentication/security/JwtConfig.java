package com.example.authentication.security;

public final class JwtConfig {

    private JwtConfig() {}

    public static final String URI = "/api/auth/**";

    public static final String HEADER = "Authorization";

    public static final String PREFIX = "Bearer";

    public static final String SECRET = "JwtSecretKey";

    public static final int EXPIRATION_IN_MILLISECONDS = 24 * 60 * 60 * 1000; // 1 day

}