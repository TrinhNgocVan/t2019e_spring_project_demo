package org.aptech.t2019e.springdemo.service.impl;

import org.aptech.t2019e.springdemo.entity.Product;
import org.aptech.t2019e.springdemo.repository.ProductRepository;
import org.aptech.t2019e.springdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
<a href="mailto:vantn93hd@gmail.com">Vantn93</a>
*/
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repo;
    @Override
    public List<Product> getAll() {
        List<Product> products = repo.findAll();
        return products;
        // bổ sung productDto , productMapper
        // -> trả ra dto ở controller
    }
}
