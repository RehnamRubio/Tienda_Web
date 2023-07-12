package com.tienda1.tienda.service.impl;

import com.tienda1.tienda.db.IProductRepository;
import com.tienda1.tienda.entities.Product;
import com.tienda1.tienda.service.IProductService;
import org.springframework.stereotype.Service;


@Service
public class ProductService extends BaseService<Product, Integer> implements IProductService {
    public ProductService(IProductRepository productRepository) {
        super(productRepository);
    }

}
