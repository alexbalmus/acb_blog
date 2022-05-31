package com.alexbalmus.blog.usecases;

import com.alexbalmus.blog.usecases.dtos.BlogDTO;
import com.alexbalmus.blog.usecases.responses.BlogHandlingResponse;

/**
 * Blog CRUD interface
 */
public interface BlogHandlingRequester
{
    BlogHandlingResponse createBlog(BlogDTO blogDTO);
    BlogHandlingResponse getBlog(String blogId);
    BlogHandlingResponse updateBlog(BlogDTO blogDTO);
    BlogHandlingResponse deleteBlog(String blogId);
}
