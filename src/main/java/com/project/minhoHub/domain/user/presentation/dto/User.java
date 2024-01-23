package com.project.minhoHub.domain.user.presentation.dto;

import com.project.minhoHub.domain.user.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Long id;
    private String name;
    private String email;
    private UserRole userRole;

}
