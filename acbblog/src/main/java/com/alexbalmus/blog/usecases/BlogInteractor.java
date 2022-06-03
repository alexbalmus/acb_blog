package com.alexbalmus.blog.usecases;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mapstruct.factory.Mappers;

import com.alexbalmus.blog.entities.Blog;
import com.alexbalmus.blog.usecases.dtos.BlogDTO;
import com.alexbalmus.blog.usecases.gateways.BlogPersistenceFactory;
import com.alexbalmus.blog.usecases.gateways.BlogPersistenceGateway;
import com.alexbalmus.blog.usecases.mappers.BlogMapper;
import com.alexbalmus.blog.usecases.responses.BlogHandlingResponse;

/**
 * The blog use-cases
 */
public class BlogInteractor implements BlogHandlingRequester
{
    private BlogPersistenceGateway persistenceGateway;
    private BlogMapper blogMapper;
    Map<String, Blog> blogsMap = new HashMap<>();

    public BlogInteractor(BlogPersistenceFactory blogPersistenceFactory)
    {
        this.persistenceGateway = blogPersistenceFactory.getImpl();
        this.blogMapper = Mappers.getMapper(BlogMapper.class);
    }

    @Override
    public BlogHandlingResponse createBlog(BlogDTO blogDTO)
    {
        boolean success = persistenceGateway.create(blogDTO);

        if (success)
        {
            Blog blog = blogMapper.dtoToBlog(blogDTO);
            blogsMap.put(blog.getId(), blog);
        }

        return BlogHandlingResponse.builder()
            .success(success)
            .build();
    }

    public BlogHandlingResponse getBlog(String blogId)
    {
        boolean success = false;
        Blog blog = blogsMap.get(blogId);
        BlogDTO blogDTO = null;

        if (blog != null)
        {
            success = true;
            blogDTO = blogMapper.blogToDto(blog);
        }

        return BlogHandlingResponse.builder()
            .success(success)
            .blogs(blogDTO != null ? List.of(blogDTO) : Collections.EMPTY_LIST)
            .build();
    }

    public BlogHandlingResponse getAllBlogs()
    {
        Collection<BlogDTO> blogs = persistenceGateway.fetchAll();
        boolean success = blogs != null && !blogs.isEmpty() ? true : false;

        if (success)
        {
            blogs.forEach(blogDTO -> blogsMap.put(blogDTO.getId(), blogMapper.dtoToBlog(blogDTO)));
        }

        return BlogHandlingResponse.builder()
            .success(success)
            .blogs(blogs)
            .build();
    }

    @Override
    public BlogHandlingResponse updateBlog(BlogDTO blogDTO)
    {
        boolean success = persistenceGateway.update(blogDTO);

        if (success)
        {
            Blog blog = blogMapper.dtoToBlog(blogDTO);
            blogsMap.put(blog.getId(), blog);
        }

        return BlogHandlingResponse.builder()
            .success(success)
            .build();
    }

    @Override
    public BlogHandlingResponse deleteBlog(String blogId)
    {
        boolean success = persistenceGateway.delete(blogId);

        if (success)
        {
            blogsMap.remove(blogId);
        }

        return BlogHandlingResponse.builder()
            .success(success)
            .build();
    }
}
