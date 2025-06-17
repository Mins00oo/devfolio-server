package com.app.devfolio.domain.resume.repository;

import com.app.devfolio.domain.resume.entity.ResumeProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeProfileRepository extends JpaRepository<ResumeProfile, Long> {
}
