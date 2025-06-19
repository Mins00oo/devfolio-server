package com.app.devfolio.domain.member.service;

import com.app.devfolio.domain.member.dto.MemberCreateReqDto;
import com.app.devfolio.domain.member.entity.Member;

public interface MemberService {
    Member createMember(MemberCreateReqDto reqDto);
}
