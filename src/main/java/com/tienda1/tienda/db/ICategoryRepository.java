package com.tienda1.tienda.db;

import com.tienda1.tienda.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category, Integer> {
}
