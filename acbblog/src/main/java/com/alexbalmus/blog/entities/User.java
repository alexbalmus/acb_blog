package com.alexbalmus.blog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A blog user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
{
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private UserStatus status;
}
