package com.alexbalmus.blog.usecases.responses;

import com.alexbalmus.blog.usecases.dtos.BlogDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogHandlingResponse
{
    private BlogDTO blogDTO;
    private String status;
}
