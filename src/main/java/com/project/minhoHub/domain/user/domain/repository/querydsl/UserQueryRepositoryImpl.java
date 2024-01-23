package com.project.minhoHub.domain.user.domain.repository.querydsl;

import com.project.minhoHub.domain.user.presentation.dto.User;
import com.project.minhoHub.global.common.dto.request.PageRequest;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.minhoHub.domain.user.domain.QUserEntity.userEntity;

@Repository
@RequiredArgsConstructor
public class UserQueryRepositoryImpl implements UserQueryRepository{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<User> findWaitingUsers(PageRequest request) {
        return jpaQueryFactory
                .select(userConstructorExpression())
                .from(userEntity)
                .offset((request.getPage() - 1) * request.getSize())
                .limit(request.getSize())
                .orderBy(userEntity.id.desc())
                .fetch();
    }

    private ConstructorExpression<User> userConstructorExpression() {
        return Projections.constructor(User.class,
                userEntity.id,
                userEntity.email,
                userEntity.name
        );
    }



}
