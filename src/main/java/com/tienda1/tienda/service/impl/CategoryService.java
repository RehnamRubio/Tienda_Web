package com.tienda1.tienda.service.impl;

import com.tienda1.tienda.db.ICategoryRepository;
import com.tienda1.tienda.entities.Category;
import com.tienda1.tienda.service.ICategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BaseService<Category, Integer> implements ICategoryService {
    public CategoryService(ICategoryRepository categoryRepository) {
        super(categoryRepository);
    }

}
