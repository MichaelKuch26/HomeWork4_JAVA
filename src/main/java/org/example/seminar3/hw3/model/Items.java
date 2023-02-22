package org.example.seminar3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private String surname;
    private Integer price;
    private Integer year;
    private Integer pages;
}
