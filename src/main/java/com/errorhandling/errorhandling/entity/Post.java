package com.errorhandling.errorhandling.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
    name = "posts", uniqueConstraints = {@UniqueConstraint( columnNames = {"title"} ) }
)
public class Post {
    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    private Long Id;

    
    // title should not be null  or empty
    // title should have at least 2 characters
    @Column( name = "title", nullable = false)
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    // post description should be not null or empty
    // post description should have at least 10 characters
    @Column( name = "description", nullable = false)
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    // post content should not be null or empty
    @NotEmpty
    @Column( name = "content", nullable = false)
    private String content;


}