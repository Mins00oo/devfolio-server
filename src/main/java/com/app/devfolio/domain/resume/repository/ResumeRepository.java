package com.app.devfolio.domain.resume.repository;

import com.app.devfolio.domain.resume.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
