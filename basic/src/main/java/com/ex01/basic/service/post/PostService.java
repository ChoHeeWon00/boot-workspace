package com.ex01.basic.service.post;

import com.ex01.basic.dto.post.PostDto;
import com.ex01.basic.entity.post.PostEntity;
import com.ex01.basic.repository.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public void insert(PostDto postDto) {
        PostEntity postEntity = new PostEntity();
        BeanUtils.copyProperties(postDto, postEntity);
        try {
            postRepository.save(postEntity);
        } catch (Exception e) {
            System.out.println("문제 발생 :" + e.getMessage());
        }
    }
}
