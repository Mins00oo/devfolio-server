package com.app.devfolio.domain.member.service;

import com.app.devfolio.domain.member.dto.MemberCreateReqDto;
import com.app.devfolio.domain.member.entity.Member;
import com.app.devfolio.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public Member createMember(MemberCreateReqDto reqDto) {
        Member member = MemberCreateReqDto.toEntity(reqDto);

        memberRepository.save(member);

        return member;
    }
}
