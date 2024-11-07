package com.edgex.json.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgex.json.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
  
  List<Tutorial> findTutorialsByTagsId(Long tagId);
}
