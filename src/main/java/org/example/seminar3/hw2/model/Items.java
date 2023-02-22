package org.example.seminar3.hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private Integer variety;
}
