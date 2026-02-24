package com.ex01.basic.exception;

public class MemberConflictException extends RuntimeException {
    public MemberConflictException() {
    }
    public MemberConflictException(String username) {
        super(username);
    }
}
