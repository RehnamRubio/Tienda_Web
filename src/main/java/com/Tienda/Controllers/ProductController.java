package com.Tienda.controllers;

import com.Tienda.entities.Product;
import com.Tienda.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final IProductService ProductService;
    public ProductController(IProductService ProductService) {
        this.ProductService = ProductService;
    }
    @GetMapping("/product")
    public String index(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("products", this.ProductService.getAllProducts());
        return "product";
    }
    @PostMapping("product/save")
    public String save(@ModelAttribute("product") Product product) {
        this.ProductService.save(product);
        return "redirect:/product";
    }
    @PostMapping("product/delete")
    public ResponseEntity<String> delete(@RequestBody Product product) {
        this.ProductService.delete(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}