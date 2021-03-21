package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Simple JavaBean domain object representing an Categories.
 * This Categories is determined by all type of Products and Services
 *
 * @author Partho Das
 */

@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String name;

    /*
     * This parentId represents an hierarchical tree
     * like categories,subcategories and so on so forth
     * this hierarchical tree is created using
     * adjacency list.
     */
    @ManyToOne
    @JoinColumn(name = "parent_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Categories parentId;
    @OneToMany(mappedBy = "parentId", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Categories> children;
    private Date createdAt;
    private Date updatedAt;
    private Boolean activeStatus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "overview_id")
    private Overview overview;
    @ManyToMany
    @JoinTable(name = "categories_faqs", joinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "faq_id", referencedColumnName = "id"))
    private List<Faqs> faqs;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "categories_tags", joinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
    private List<Tags> tags;

}
