package dev.teju.productservice.controllers;

import dev.teju.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    //field injection
//    @Autowired
//    private ProductService productService;--not recommended as someone new cant figureout whos intilizibg

    //constructor injection---more readable so best practice
    private ProductService productService;
    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

    //setter injection
//    @Autowired
//    public  void setProductService(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping
    public void getAllProducts() {
    }
    // localhost:8080/products/123
    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);

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
