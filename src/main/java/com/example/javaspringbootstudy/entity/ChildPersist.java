package com.example.javaspringbootstudy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class ChildPersist {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private ParentPersist parent;
}
