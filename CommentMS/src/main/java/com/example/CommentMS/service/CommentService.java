package com.example.CommentMS.service;

import com.example.CommentMS.jpa.entity.Comment;
import com.example.CommentMS.rest.model.MyComment;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public interface CommentService {
    boolean createComment(Comment comment);

    ArrayList<Comment> getAllComments();
}
