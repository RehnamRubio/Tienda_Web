
package com.tienda1.tienda.db;
import com.tienda1.tienda.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Integer>{
    
}
