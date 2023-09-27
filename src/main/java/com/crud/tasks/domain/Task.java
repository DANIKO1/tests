package com.crud.tasks.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "tasks")
public class Task {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String title;
    @Column(name = "description")
    private String content;

    public Long getId() {
        return id;
    }
}