package com.bezkoder.spring.hibernate.manytomany.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Data
@NoArgsConstructor
@Entity
@Table(name = "tags")
public class Tag {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name")
  private String name;

  @ManyToMany(fetch = FetchType.LAZY,
      cascade = {
          CascadeType.PERSIST,
          CascadeType.MERGE
      },
      mappedBy = "tags")
  @JsonIgnore
  private Set<Tutorial> tutorials = new HashSet<>();

}
