package com.ex01.basic.exception.post;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalPostExceptionHandler {
    @ExceptionHandler(PostNotFoundException.class)
    public ResponseEntity<ProblemDetail> notFoundHandler(
            PostNotFoundException postNotFoundException ){

        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        problemDetail.setTitle("게시글 없음");
        problemDetail.setDetail( postNotFoundException.getMessage() );

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body( problemDetail );
    }
}
