package com.project.minhoHub.global.exception;

import com.project.minhoHub.global.exception.error.ErrorCode;

public class ForbiddenException extends BusinessException {
    
    public static final ForbiddenException EXCEPTION = new ForbiddenException();
    
    private ForbiddenException(){
        super(ErrorCode.FORBIDDEN);
    }
    
}
