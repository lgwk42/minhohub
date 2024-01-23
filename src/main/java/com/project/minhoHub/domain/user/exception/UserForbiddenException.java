package com.project.minhoHub.domain.user.exception;

import com.project.minhoHub.domain.user.exception.error.UserError;
import com.project.minhoHub.global.exception.BusinessException;

public class UserForbiddenException extends BusinessException {
    public static final UserForbiddenException EXCEPTION = new UserForbiddenException();
    private UserForbiddenException(){
        super(UserError.USER_FORBIDDEN);
    }
}
