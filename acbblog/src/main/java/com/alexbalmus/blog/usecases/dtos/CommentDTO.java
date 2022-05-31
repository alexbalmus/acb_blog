package com.alexbalmus.blog.usecases.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO
{
    private String blogId;
    private String entryId;
    private String parentCommentId;
    private String text;
}
