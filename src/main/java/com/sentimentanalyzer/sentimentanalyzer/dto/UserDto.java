package com.sentimentanalyzer.sentimentanalyzer.dto;

import com.sentimentanalyzer.sentimentanalyzer.entity.User;

import jakarta.annotation.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends Dto {
    private String name;
    private String email;
    private String password;

}
