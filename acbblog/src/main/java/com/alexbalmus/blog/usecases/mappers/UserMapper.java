package com.alexbalmus.blog.usecases.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.alexbalmus.blog.entities.User;
import com.alexbalmus.blog.usecases.dtos.UserDTO;

@Mapper
public interface UserMapper
{
    @Mappings({
        @Mapping(target="status", expression = "java(UserStatus.valueOf(userDTO.getStatus()))")
    })
    User dtoToUser(UserDTO userDTO);

    @Mappings({
        @Mapping(target="status", expression = "java(user.getStatus().name())")
    })
    UserDTO userToDto(User user);
}
