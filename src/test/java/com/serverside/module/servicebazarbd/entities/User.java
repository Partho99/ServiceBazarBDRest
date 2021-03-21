

/*
 * Copyright 2020-2021 the original author or authors.
 *
 * Licensed under the XYZ licence, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://servicebazarbd.com/licence/Licence-1.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Simple JavaBean domain object representing an User.
 * This User is determined by all type of user like
 * customer,serviceProvider,Admin,manager etc
 *
 * @author Partho Das
 */

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String fullName;
    @Column(unique = true)
    private Long mobileNumber;
    private String password;
    private String confirmPassword;
    private Boolean activeStatus;
    private Date createdAt;
    private Date updatedAt;
    @Column(unique = true)
    private Long nationalId;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id"))
    private Collection<Role> roles;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<UserImage> images;
    @OneToMany
    private Set<DiscountCoupon> discountCoupons;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<UserAddress> userAddresses;

}
