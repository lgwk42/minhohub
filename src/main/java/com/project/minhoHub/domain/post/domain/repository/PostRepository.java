package com.project.minhoHub.domain.post.domain.repository;

import com.project.minhoHub.domain.post.domain.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
