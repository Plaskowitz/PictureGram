package com.example.CommentMS.rest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor // because of Jackson
@Data
public class MyComment {

    private String comment;
    private Long pictureId;


    // additional API information about the user
    /**
     * check when this user was registered
     */
//    private LocalDateTime registrationDate;
    /**
     * check if this user was "deleted" within the database
     */
//    private Boolean active;

//    private int port;
//    private String inetAddress;
}
