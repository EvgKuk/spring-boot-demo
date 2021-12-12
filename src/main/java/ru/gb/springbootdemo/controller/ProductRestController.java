package ru.gb.springbootdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.springbootdemo.dto.Product;
import ru.gb.springbootdemo.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ProductRestController {
    private ProductService productService;

    public ProductRestController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAllProduct(Model model){
        return productService.getAll();
    }

    @GetMapping("/info/{id}")
    public Product getProductInfo (@PathVariable Integer id, Model model){
        return productService.findById(id);
    }

    @GetMapping("/add")
    public Product saveProduct(@RequestBody Product product){
        productService.save(product);
        return product;
    }

    @PostMapping("/del/{id}")
    public String saveProduct (@PathVariable Integer id){
        productService.deleteById(id);
        return "redirect:/all";
    }
}
