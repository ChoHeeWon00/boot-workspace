package com.ex01.basic.dto.post;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostDto {
    private Long number;
    private String title;
    private String content;
}
