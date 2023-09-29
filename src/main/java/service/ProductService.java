package service;

import entity.Product;
import entity.User;
import repository.ProductRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class ProductService {

    private final ProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    public ProductService() throws SQLException {
    }

    public void register(int id) throws SQLException {
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("please enter your createdate");
        String createdate = scanner.nextLine();
        int result = productRepository.save(id,name,createdate);
        if(result != 0)
            System.out.println(name + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }

    public void changeProduct(int id) throws SQLException {
        System.out.println("Please enter your new name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your new createdate:");
        String createdate = scanner.nextLine();
        int result = productRepository.updateProduct(id,name,createdate);
        if(result != 0)
            System.out.println("successfully edited to database");
        else
            System.out.println("OOps! :(");
    }

    public void delete(int id) throws SQLException {
        int result = productRepository.deleteProduct(id);
        if(result != 0)
            System.out.println("successfully deleted from database");
        else
            System.out.println("OOps! :(");
    }
}
