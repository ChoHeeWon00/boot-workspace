package com.example.jwt_test.exception;

public class MemberAccessDeniedException extends RuntimeException{
    public MemberAccessDeniedException(String message) {
        super(message);
    }
    public MemberAccessDeniedException() {
    }
}
