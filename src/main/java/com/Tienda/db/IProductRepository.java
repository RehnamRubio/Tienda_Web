/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.db;

/**
 *
 * @author renan
 */
import com.Tienda.entities.Product;
import org.springframework.data.repository.CrudRepository;
public interface IProductRepository extends CrudRepository<Product, Integer> {
}
