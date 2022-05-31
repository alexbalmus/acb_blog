package com.alexbalmus.blog.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A blog
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog
{
    private String name;
    private String handle;
    private List<Entry> entries;
    private User user;
}
