package guru.springframework.repository;

import guru.springframework.model.Product;

public interface ProductRepository {
    Product getProduct(Long id);
}
