package com.alexbalmus.blog;

import com.alexbalmus.blog.frameworks.persistence.memory.InMemoryBlogPersistenceFactoryImpl;
import com.alexbalmus.blog.usecases.BlogInteractor;

/**
 * Hello world!
 *
 */
public class App 
{
    BlogInteractor blogInteractor = new BlogInteractor(new InMemoryBlogPersistenceFactoryImpl());
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
