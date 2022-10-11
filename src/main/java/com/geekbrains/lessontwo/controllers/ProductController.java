package com.geekbrains.lessontwo.controllers;

import com.geekbrains.lessontwo.entities.Product;
import com.geekbrains.lessontwo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/showProduct")
    public String hello(Model uiModel) {
        System.out.println( productService.getList());
        uiModel.addAttribute("products", productService.getList());
        return "products";
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showStudentById(Model uiModel, @RequestParam int id) {
        return productService.getProductById(id);
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        productService.addProduct(product);
        return "product-form-result";
    }
}
