package com.practice.ecommorce.Controller;


import com.practice.ecommorce.Model.Product;
import com.practice.ecommorce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    @Autowired
     public ProductController(ProductService productService){

        this.productService=productService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){

        return productService.getProductById(id);
    }
    @GetMapping
    public List<Product> getProducts(){

        return productService.getAllProducts();
    }
}
