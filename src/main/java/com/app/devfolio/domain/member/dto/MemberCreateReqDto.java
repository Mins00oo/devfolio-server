package com.app.devfolio.domain.member.dto;

import com.app.devfolio.domain.member.entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberCreateReqDto {
    private String name;

    private String email;

    private String phone;

    public static Member toEntity(
            MemberCreateReqDto requestDto
    ) {
        return Member.builder()
                .name(requestDto.name)
                .email(requestDto.email)
                .phone(requestDto.getPhone())
                .build();
    }
}
