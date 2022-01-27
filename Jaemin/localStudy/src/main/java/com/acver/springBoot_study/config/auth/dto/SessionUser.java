package com.acver.springBoot_study.config.auth.dto;

import com.acver.springBoot_study.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
