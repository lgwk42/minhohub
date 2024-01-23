package com.project.minhoHub.domain.user.service.querydsl;

import com.project.minhoHub.domain.user.domain.repository.querydsl.UserQueryRepository;
import com.project.minhoHub.domain.user.presentation.dto.User;
import com.project.minhoHub.global.common.dto.request.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class UserQueryServiceImpl implements UserQueryService{

    private final UserQueryRepository movieQueryRepository;

    @Override
    public List<User> findWaitingUsers(PageRequest request) {
        return movieQueryRepository.findWaitingUsers(request);
    }

}
