package com.HibernateCRUD.CRUD_HIBERNATE.DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StudentResponseDTO {
    int id;
    String name;
    String collegeName;
    int rolNo;
}
