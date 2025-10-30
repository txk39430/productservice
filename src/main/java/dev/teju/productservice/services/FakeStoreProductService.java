package dev.teju.productservice.services;

import dev.teju.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements  ProductService{

    public String getProductById(Long id) {
        return "id:" + id ;
        //return null;
    }
}