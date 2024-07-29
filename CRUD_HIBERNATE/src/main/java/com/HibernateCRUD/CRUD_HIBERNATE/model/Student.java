package com.HibernateCRUD.CRUD_HIBERNATE.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table (name = "student")

public class Student {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    int rolNo;
    String name;
    String collegeName;
}
