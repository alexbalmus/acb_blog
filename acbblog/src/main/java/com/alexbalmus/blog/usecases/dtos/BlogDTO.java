package com.alexbalmus.blog.usecases.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDTO
{
    private String id;
    private String name;
    private String handle;
    private List<EntryDTO> entries;
    private UserDTO user;
}
