package com.example.CommentMS.rest;

import com.example.CommentMS.jpa.entity.Comment;
import com.example.CommentMS.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CommentController {


    // remote to create User in Database
    private final CommentService commentService;

    // remote to map from User-Entity to API-Object
//    private final MappingService mappingService;


    public CommentController(CommentService commentService) {
        this.commentService = commentService;
//        this.mappingService = mappingService;
    }

    // request:
    // GET        with request parameters
    //   localhost:8080?userName=Nik&name=Nikita.Kolytschew
    //
    // POST/PUT   with request body
    //   localhost:8080
    // valid body:    { "username": "nik", "name": "nikita"}
    // invalid body:  { "username": "nik", "name1": "nikita"}
    //
//    @PostMapping("comment")
//    public ResponseEntity<MyComment> createMyUser(@RequestBody MyComment comment) {
//        final ResponseEntity<MyComment> response = this.commentService.createComment(comment);
//        return response;
//    }
//
//    @GetMapping("comments")
//    public ArrayList<MyComment> users() {
//        return this.commentService.getAllComments();
//    }


    @PostMapping("comment")
    public ResponseEntity<String> createComment(@RequestBody Comment comment) {

        boolean r = this.commentService.createComment(comment);
        if(r) {
            return new ResponseEntity<>("Comment saved", HttpStatus.OK);
        }
        return new ResponseEntity<>("Comment not saved. Picture-ID not already used!", HttpStatus.NOT_ACCEPTABLE);
    }

    @GetMapping("comment")
    public List<Comment> getComments() {
        return this.commentService.getAllComments();
    }

}