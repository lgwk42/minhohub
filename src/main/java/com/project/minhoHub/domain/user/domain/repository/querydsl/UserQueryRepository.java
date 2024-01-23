package com.project.minhoHub.domain.user.domain.repository.querydsl;


import com.project.minhoHub.domain.user.presentation.dto.User;
import com.project.minhoHub.global.common.dto.request.PageRequest;

import java.util.List;

public interface UserQueryRepository {

    List<User> findWaitingUsers(PageRequest request);

}
