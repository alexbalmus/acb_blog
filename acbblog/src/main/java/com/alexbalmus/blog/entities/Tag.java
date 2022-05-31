package com.alexbalmus.blog.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A blog tag
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag
{
    private String name;
    private List<Entry> taggedEntries;
}
