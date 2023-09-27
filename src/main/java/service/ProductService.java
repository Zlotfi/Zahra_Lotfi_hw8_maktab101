package service;

import entity.Product;
import entity.User;
import repository.ProductRepository;

import java.sql.SQLException;
import java.util.Date;

public class ProductService {

    private final ProductRepository productRepository = new ProductRepository();

    public ProductService() throws SQLException {
    }

    public void register() throws SQLException {
        Product product = new Product(null,"Women's coat", '11-12-22',null,null);
        int result = productRepository.save(product);
        if(result != 0)
            System.out.println(product.getName() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }
}
