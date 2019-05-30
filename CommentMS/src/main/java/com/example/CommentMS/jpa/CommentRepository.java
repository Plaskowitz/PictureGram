package com.example.CommentMS.jpa;

import com.example.CommentMS.jpa.entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
