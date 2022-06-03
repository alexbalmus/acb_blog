package com.alexbalmus.blog.frameworks.persistence.memory;

import com.alexbalmus.blog.usecases.gateways.BlogPersistenceFactory;
import com.alexbalmus.blog.usecases.gateways.BlogPersistenceGateway;

public class InMemoryBlogPersistenceFactoryImpl implements BlogPersistenceFactory
{
    @Override
    public BlogPersistenceGateway getImpl()
    {
        return new InMemoryStore();
    }
}
