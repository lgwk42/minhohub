package com.project.minhoHub.domain.user.exception;

import com.project.minhoHub.domain.user.exception.error.UserError;
import com.project.minhoHub.global.exception.BusinessException;

public class UserExistException extends BusinessException {

    public static final UserExistException EXCEPTION = new UserExistException();

    private UserExistException(){
        super(UserError.USER_EXIST);
    }

}
