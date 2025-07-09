package com.tecdesoftware.market.web.controller;

import com.tecdesoftware.market.domain.Product;
import com.tecdesoftware.market.domain.service.ProductService;
import com.tecdesoftware.market.persistence.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Le dice a Spring que va a ser el controlador de una API REST
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    // 1. Obtener todos los productos
    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    // 2. Obtener un producto por ID
    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int productId) {
        return productService.getProduct(productId);
    }

    // 3. Guardar un producto
    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    // 4. Eliminar un producto por ID
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int productId) {
        return productService.delete(productId);
    }
}

