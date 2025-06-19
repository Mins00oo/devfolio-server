package com.app.devfolio.domain.member.controller;

import com.app.devfolio.domain.member.dto.MemberCreateReqDto;
import com.app.devfolio.domain.member.service.MemberService;
import com.app.devfolio.global.common.BaseResponse;
import com.app.devfolio.global.common.StatusCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<Object> createMember(@RequestBody MemberCreateReqDto memberCreateReqDto) {

        memberService.createMember(memberCreateReqDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new BaseResponse<>(StatusCode.SUCCESS));
    }
}
