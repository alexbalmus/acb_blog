package com.alexbalmus.blog.usecases;

import com.alexbalmus.blog.usecases.dtos.BlogDTO;
import com.alexbalmus.blog.usecases.responses.BlogHandlingResponse;

/**
 * The blog use-cases
 */
public class BlogInteractor implements BlogHandlingRequester
{
    @Override
    public BlogHandlingResponse createBlog(BlogDTO blogDTO)
    {
        return null;
    }

    @Override
    public BlogHandlingResponse getBlog(String blogId)
    {
        return null;
    }

    @Override
    public BlogHandlingResponse updateBlog(BlogDTO blogDTO)
    {
        return null;
    }

    @Override
    public BlogHandlingResponse deleteBlog(String blogId)
    {
        return null;
    }
}
