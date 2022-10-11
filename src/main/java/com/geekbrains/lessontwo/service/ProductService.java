package com.geekbrains.lessontwo.service;

import com.geekbrains.lessontwo.entities.Product;
import com.geekbrains.lessontwo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    //Добавление товара
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    //Список всех товаров
    public List<Product> getList() {
        return productRepository.getList();
    }

    //Товар по id
    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }
}
