package com.alexbalmus.blog.usecases;

import java.util.Collection;
import java.util.List;

import com.alexbalmus.blog.usecases.dtos.BlogDTO;
import com.alexbalmus.blog.usecases.gateways.BlogPersistenceGateway;
import com.alexbalmus.blog.usecases.responses.BlogHandlingResponse;

/**
 * The blog use-cases
 */
public class BlogInteractor implements BlogHandlingRequester
{
    private BlogPersistenceGateway persistenceGateway;

    @Override
    public BlogHandlingResponse createBlog(BlogDTO blogDTO)
    {
        boolean success = persistenceGateway.create(blogDTO);
        return BlogHandlingResponse.builder()
            .success(success)
            .blogs(List.of(blogDTO))
            .build();
    }

    public BlogHandlingResponse getBlog(String blogId)
    {
        BlogDTO blogDTO = persistenceGateway.findById(blogId);
        boolean success = blogDTO != null ? true : false;
        return BlogHandlingResponse.builder()
            .success(success)
            .blogs(List.of(blogDTO))
            .build();
    }

    public BlogHandlingResponse getAllBlogs()
    {
        Collection<BlogDTO> blogs = persistenceGateway.fetchAll();
        boolean success = blogs != null && !blogs.isEmpty() ? true : false;
        return BlogHandlingResponse.builder()
            .success(success)
            .blogs(blogs)
            .build();
    }

    @Override
    public BlogHandlingResponse updateBlog(BlogDTO blogDTO)
    {
        boolean success = persistenceGateway.update(blogDTO);
        return BlogHandlingResponse.builder()
            .success(success)
            .blogs(List.of(blogDTO))
            .build();
    }

    @Override
    public BlogHandlingResponse deleteBlog(String blogId)
    {
        boolean success = persistenceGateway.delete(blogId);
        return BlogHandlingResponse.builder()
            .success(success)
            .build();
    }
}
