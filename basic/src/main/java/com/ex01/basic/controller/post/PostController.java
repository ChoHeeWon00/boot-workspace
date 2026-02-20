package com.ex01.basic.controller.post;

import com.ex01.basic.dto.post.PostDto;
import com.ex01.basic.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<String> insert(
            @ParameterObject @ModelAttribute PostDto postDto) {
        postService.insert(postDto);
        return ResponseEntity.ok("데이터 추가");
    }
}
