package com.alexbalmus.blog.usecases.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.alexbalmus.blog.entities.Entry;
import com.alexbalmus.blog.entities.Tag;
import com.alexbalmus.blog.usecases.dtos.EntryDTO;

@Mapper
public interface EntryMapper
{
    Entry dtoToEntry(EntryDTO entryDTO);
    EntryDTO entryToDto(Entry entry);

    default List<Tag> mapStringsToTags(List<String> tagsAsStrings)
    {
        return tagsAsStrings.stream().map(tagsAsString -> {
            Tag tag = new Tag();
            tag.setName(tagsAsString);
            return tag;
        }).collect(Collectors.toList());
    }

    default List<String> mapTagsToStrings(List<Tag> tags)
    {
        return tags.stream().map(tag -> tag.getName())
            .collect(Collectors.toList());
    }
}
