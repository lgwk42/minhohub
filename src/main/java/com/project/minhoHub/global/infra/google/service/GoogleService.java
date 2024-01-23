package com.project.minhoHub.global.infra.google.service;

import com.project.minhoHub.global.infra.google.dto.OAuth2Attribute;

public interface GoogleService {
    OAuth2Attribute getTokenInfo(String idToken);

}
