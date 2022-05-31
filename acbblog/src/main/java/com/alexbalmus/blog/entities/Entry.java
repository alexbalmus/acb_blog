package com.alexbalmus.blog.entities;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A blog entry
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entry
{
    private String title;
    private String content;
    private LocalDate date;
    private List<Tag> tags;
}
