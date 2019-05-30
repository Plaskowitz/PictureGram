package com.example.CommentMS.service;

import com.example.CommentMS.jpa.CommentRepository;
import com.example.CommentMS.jpa.entity.Comment;
import com.example.CommentMS.rest.model.MyComment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentServiceImpl implements CommentService {

    CommentRepository repo;

    public CommentServiceImpl(CommentRepository repo) {
        this.repo = repo;
    }

    @Override
    public boolean createComment(Comment comment) {

        var it = repo.save(comment);
        if(it != null) {
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Comment> getAllComments() {
        ArrayList<Comment> list = (ArrayList<Comment>) repo.findAll();
        return list;

    }
}
