package ru.gb.springbootdemo.service;

import org.springframework.stereotype.Service;
import ru.gb.springbootdemo.dto.Product;
import ru.gb.springbootdemo.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public Product findById(int id){
        return productRepository.findById(id);
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
