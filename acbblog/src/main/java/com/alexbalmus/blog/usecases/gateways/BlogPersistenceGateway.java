package com.alexbalmus.blog.usecases.gateways;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.alexbalmus.blog.usecases.dtos.BlogDTO;

public interface BlogPersistenceGateway
{
    boolean create(BlogDTO blogDTO);
    BlogDTO findById(String blogId);
    Collection<BlogDTO> fetchAll();
    boolean update(BlogDTO blogDTO);
    boolean delete(String blogId);
}
