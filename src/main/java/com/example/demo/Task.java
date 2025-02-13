package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(length = 20)
    String description;

    @Column
    boolean completed;


    public void setCompleted(boolean completed) {
    }
}
