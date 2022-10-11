package com.geekbrains.lessontwo.repositories;

import com.geekbrains.lessontwo.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productList = new ArrayList<>();
    private int counter = 0;

    //Добавление товара в список
    public void addProduct(Product product) {
        product.setId(++counter);
        productList.add(product);
    }

    //Список всех товаров
    public List<Product> getList() {
        if (productList.isEmpty()) {
            productList.add(new Product(0, "Empty", 0));
        }
        return productList;
    }

    //Товар по id
    public Product getProductById(int id) {
        for (Product p: productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
