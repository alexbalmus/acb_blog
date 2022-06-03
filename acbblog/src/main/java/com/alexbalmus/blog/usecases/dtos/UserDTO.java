package com.alexbalmus.blog.usecases.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO
{
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String status;
}