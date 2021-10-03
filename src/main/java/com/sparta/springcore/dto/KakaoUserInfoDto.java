package com.sparta.springcore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // 이걸로 get~~ 메소드가 자동으로 만들어짐
@AllArgsConstructor
public class KakaoUserInfoDto {
    private Long id;
    private String nickname;
    private String email;

}
