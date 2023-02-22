package org.example.seminar3.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private Integer price;
    private Integer variety;
}
