package dev.teju.productservice.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public void getAllProducts() {
    }
    // localhost:8080/products/123
    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return "Here is product id: " + id;

    }
    @DeleteMapping("{id}")
    public void deleteProductById(Long id) {
    }
    @PutMapping("{id}")
    public void updateProductById(Long id) {

    }
    @PostMapping
    public String createProduct() {

        return "the product id is ID: " + UUID.randomUUID();
    }

}
