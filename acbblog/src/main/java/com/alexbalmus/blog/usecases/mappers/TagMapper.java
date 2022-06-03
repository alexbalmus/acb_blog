package com.alexbalmus.blog.usecases.mappers;

import org.mapstruct.Mapper;

import com.alexbalmus.blog.entities.Tag;
import com.alexbalmus.blog.usecases.dtos.TagDTO;

@Mapper
public interface TagMapper
{
    Tag dtoToTag(TagDTO tagDTO);
    TagDTO tagToDto(Tag tag);
}
