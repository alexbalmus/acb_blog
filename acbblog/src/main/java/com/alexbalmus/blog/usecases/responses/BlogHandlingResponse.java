package com.alexbalmus.blog.usecases.responses;

import java.util.ArrayList;
import java.util.Collection;

import com.alexbalmus.blog.usecases.dtos.BlogDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BlogHandlingResponse
{
    private boolean success;
    private Collection<BlogDTO> blogs;
}
