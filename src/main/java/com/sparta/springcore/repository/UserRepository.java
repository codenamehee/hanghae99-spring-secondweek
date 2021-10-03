package com.sparta.springcore.repository;

import com.sparta.springcore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // username을 인자로 가지고 db에서 username을 찾고 그 결과를 optional<user>로 내라. 는 의미
    Optional<User> findByUsername(String username);
    Optional<User> findByKakaoId(Long kakaoId);
    Optional<User> findByEmail(String email);
}
