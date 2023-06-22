package com.Tienda.service.impl;
import com.Tienda.db.IProductRepository;
import com.Tienda.entities.Product;
import com.Tienda.service.IProductService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService implements IProductService {
    private final IProductRepository ProductRepository;
    public ProductService(IProductRepository productRepository) {
        this.ProductRepository = productRepository;
    }
    public List<Product> getAllProducts() {
        return (List<Product>) this.ProductRepository.findAll();
    }
    public void save(Product product) {
        product.setActivo(true);
        this.ProductRepository.save(product);
    }
    public void delete(Product product) {
        this.ProductRepository.delete(product);
    }
}