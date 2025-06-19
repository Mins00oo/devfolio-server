package com.app.devfolio.member;

import com.app.devfolio.domain.member.controller.MemberController;
import com.app.devfolio.domain.member.dto.MemberCreateReqDto;
import com.app.devfolio.domain.member.service.MemberService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MemberController.class)
public class MemberControllerTest {
    @MockitoBean
    MemberService memberService;

    @Autowired
    MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    @DisplayName("회원 생성 테스트")
    public void createMember() throws Exception {
        MemberCreateReqDto memberCreateReqDto = new MemberCreateReqDto();

        memberCreateReqDto.setEmail("test@dev.co.kr");
        memberCreateReqDto.setName("테스트 유저");
        memberCreateReqDto.setPhone("010-1111-2222");

        ResultActions resultActions = mockMvc.perform(
                post("/api/member")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(memberCreateReqDto))
        );

        // then
        resultActions
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.isSuccess").value(true))
                .andExpect(jsonPath("$.message").value("요청에 성공하였습니다."))
                .andExpect(jsonPath("$.code").value(100));

        verify(memberService, times(1)).createMember(any(MemberCreateReqDto.class));

    }


}
