package com.practice.ecommorce.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
//@Entity
public class Tags {
    @Id
    private int id;
    private String tagName;
    @ManyToMany(mappedBy = "tags")
    private List<Product> products;

}
