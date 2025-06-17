package com.app.devfolio.domain.member.controller;

import com.app.devfolio.global.common.BaseResponse;
import com.app.devfolio.global.common.StatusCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    @PostMapping
    public ResponseEntity<Object> createMember(@RequestBody MemberCreateRequestDto requestDto) {

//        memberService.createMember(requestDto);
        System.out.println("requestDto = " + requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(new BaseResponse<>(StatusCode.SUCCESS));
    }
}
