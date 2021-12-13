package ru.gb.springbootdemo.repository;

import org.springframework.stereotype.Component;
import ru.gb.springbootdemo.dto.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Component
public class ProductRepository {
    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = new ArrayList<>();
        productList.add(new Product(1, "молоко", 15));
        productList.add(new Product(2, "кофе",50));
        productList.add(new Product(3, "сахар",5));
    }

    public List<Product> getAll() {
        return productList;
    }

    public void save (Product product){
        productList.add(product);
    }

    public Product findById(int id) {
        return productList.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    public void deleteById (int id) {
        productList.stream().filter(product -> product.getId() == id).findFirst().ifPresent(productList::remove);
    }
}
