package com.app.devfolio.domain.member.repository;

import com.app.devfolio.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
