package com.edgex.json.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgex.json.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
  List<Tag> findTagsByTutorialsId(Long tutorialId);
}
