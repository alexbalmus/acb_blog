package com.alexbalmus.blog.usecases.gateways;

public interface BlogPersistenceFactory
{
    BlogPersistenceGateway getImpl();
}
