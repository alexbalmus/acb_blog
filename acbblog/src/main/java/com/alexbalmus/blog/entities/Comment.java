package com.alexbalmus.blog.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A blog post comment
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment
{
    private String text;
    private List<Comment> replies;
}
