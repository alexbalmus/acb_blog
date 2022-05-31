package com.alexbalmus.blog.frameworks.persistence.memory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.alexbalmus.blog.usecases.dtos.BlogDTO;
import com.alexbalmus.blog.usecases.gateways.BlogPersistenceGateway;

import lombok.CustomLog;

public class InMemoryStore implements BlogPersistenceGateway
{
    Map<String, BlogDTO> blogs = new HashMap<>();

    @Override
    public boolean create(BlogDTO blogDTO)
    {
        if (blogDTO == null)
        {
            return false;
        }

        try
        {
            blogs.put(blogDTO.getId(), blogDTO);
        }
        catch (Exception e)
        {
            // TODO: add logging
            System.err.println(e + "\n" + e.getStackTrace().toString());
            return false;
        }

        return true;
    }

    @Override
    public BlogDTO findById(String blogId)
    {
        return blogs.get(blogId);
    }

    @Override
    public Collection<BlogDTO> fetchAll()
    {
        return blogs.values();
    }

    @Override
    public boolean update(BlogDTO blogDTO)
    {
        return create(blogDTO);
    }

    @Override
    public boolean delete(String blogId)
    {
        try
        {
            blogs.remove(blogId);
        }
        catch (Exception e)
        {
            // TODO: add logging
            System.err.println(e + "\n" + e.getStackTrace().toString());
            return false;
        }

        return true;
    }
}
