package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class CommentsAndReplies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private Boolean activeStatus;
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne
    @JoinColumn(name = "replies_id")
    private CommentsAndReplies replies;
    @OneToMany(mappedBy = "replies", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CommentsAndReplies> children;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

}
