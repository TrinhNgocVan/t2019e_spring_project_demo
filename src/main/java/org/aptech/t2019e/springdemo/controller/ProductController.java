package org.aptech.t2019e.springdemo.controller;

import org.aptech.t2019e.springdemo.entity.Product;
import org.aptech.t2019e.springdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
<a href="mailto:vantn93hd@gmail.com">Vantn93</a>
*/
@RestController
@RequestMapping(value = "api/v1")
public class ProductController {
    @Autowired
    private ProductService productService;
//    @RequestMapping(method = RequestMethod.GET , value = "/products")
    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> gets(){
       return ResponseEntity.ok(productService.getAll());
    }
}
