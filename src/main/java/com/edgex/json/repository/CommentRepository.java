package com.edgex.json.repository;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgex.json.model.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findByTutorialId(Long postId);
  
  @Transactional
  void deleteByTutorialId(long tutorialId);
}
