package com.project.minhoHub.domain.user.presentation;

import com.project.minhoHub.domain.user.presentation.dto.User;
import com.project.minhoHub.domain.user.service.UserService;
import com.project.minhoHub.domain.user.service.querydsl.UserQueryService;
import com.project.minhoHub.global.common.dto.request.PageRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Tag(name = "유저", description = "유저")
public class UserController {

    private final UserService service;
    private final UserQueryService queryService;

    @Operation(summary = "유저 조회", description = "유저를 조회합니다.")
    @GetMapping("")
    public ResponseEntity<List<User>> findWaitingUsers(PageRequest request){
        return ResponseEntity.ok(queryService.findWaitingUsers(request));
    }

}
