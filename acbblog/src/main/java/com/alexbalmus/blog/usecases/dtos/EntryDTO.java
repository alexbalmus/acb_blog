package com.alexbalmus.blog.usecases.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntryDTO
{
    private String id;
    private String blogId;
    private String title;
    private String content;
    private String commentsOption = "MODERATED"; // Valid options: ALLOWED, MODERATED, DISABLED
    private List<String> tags;
}
