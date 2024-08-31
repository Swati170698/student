package com.calculator.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Entity
@Data
public class Student {
    @Id
    private UUID id;
    private String name;
    private String age;
    private String phoneNo;
}
