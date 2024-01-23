package com.project.minhoHub.domain.user.service.querydsl;

import com.project.minhoHub.global.common.dto.request.PageRequest;
import com.project.minhoHub.domain.user.presentation.dto.User;

import java.util.List;

public interface UserQueryService {

    List<User> findWaitingUsers(PageRequest request);

}
