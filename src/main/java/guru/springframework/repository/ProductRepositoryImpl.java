package guru.springframework.repository;

import guru.springframework.model.Product;

/**
 * Created by jt on 6/6/15.
 */
public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public Product getProduct(Long id){
        Product product = new Product();
        product.setDescription("Spring Guru In Action");
        return product;
    }
}
