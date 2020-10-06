package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;

@Data
@JsonFilter("UserInfoV2")
public class UserV2 extends User{
    private String grade;
}
