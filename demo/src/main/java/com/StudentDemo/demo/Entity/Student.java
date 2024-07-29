package com.StudentDemo.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data

public class Student {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int rollNo;
    String name;
}
