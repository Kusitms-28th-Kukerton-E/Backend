package com.kukertone.kukertone_be.domain.member.entity;

import com.kukertone.kukertone_be.domain.member.Role;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;

    protected String password;

    protected String email;

    protected String name;

    protected Role role;
}
