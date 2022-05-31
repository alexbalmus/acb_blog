package com.alexbalmus.blog.entities;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum CommentsOption
{
    ALLOWED, MODERATED, DISABLED
}

/**
 * A blog entry
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entry
{
    private String id;
    private Blog blog;
    private String title;
    private String content;
    private LocalDate date;
    private CommentsOption commentsOption = CommentsOption.MODERATED;
    private List<Comment> comments;
    private List<Tag> tags;
}
