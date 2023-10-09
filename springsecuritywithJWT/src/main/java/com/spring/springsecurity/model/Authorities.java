package com.spring.springsecurity.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "authorities")
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "authorities_name")
    private String authoritiesname;

    @ManyToMany(mappedBy = "authorities")
    private List<User> users = new ArrayList<>();

    public Authorities(String authoritiesname) {
        this.authoritiesname = authoritiesname;
    }

    public Authorities() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthoritiesname() {
        return authoritiesname;
    }

    public void setAuthoritiesname(String authoritiesname) {
        this.authoritiesname = authoritiesname;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
