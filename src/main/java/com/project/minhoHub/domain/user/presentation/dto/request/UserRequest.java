package com.project.minhoHub.domain.user.presentation.dto.request;

import com.project.minhoHub.domain.user.domain.enums.UserRole;
import com.project.minhoHub.domain.user.presentation.dto.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private Long id;
    private String name;
    private String email;
    private UserRole userRole;

    public User toUser(){
        return User.builder()
                .id(this.id)
                .name(this.name)
                .email(this.email)
                .userRole(this.userRole)
                .build();
    }

}
