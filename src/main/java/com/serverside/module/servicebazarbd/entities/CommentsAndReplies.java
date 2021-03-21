package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class CommentsAndReplies implements Serializable {

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

    public CommentsAndReplies() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CommentsAndReplies getReplies() {
        return replies;
    }

    public void setReplies(CommentsAndReplies replies) {
        this.replies = replies;
    }

    public List<CommentsAndReplies> getChildren() {
        return children;
    }

    public void setChildren(List<CommentsAndReplies> children) {
        this.children = children;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CommentsAndReplies{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", activeStatus=" + activeStatus +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", replies=" + replies +
                ", children=" + children +
                ", user=" + user +
                '}';
    }
}
