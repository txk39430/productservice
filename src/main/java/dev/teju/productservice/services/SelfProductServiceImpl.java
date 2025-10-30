package dev.teju.productservice.services;

import dev.teju.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service("selfProductService")
public class SelfProductServiceImpl implements ProductService {

    @Override
    public String getProductById(Long id) {
        return null;
    }
}
