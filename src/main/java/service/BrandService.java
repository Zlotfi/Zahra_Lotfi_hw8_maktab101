package service;

import entity.Brand;
import entity.User;
import repository.BrandRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class BrandService {

    private final BrandRepository brandRepository = new BrandRepository();
    Scanner scanner = new Scanner(System.in);

    public BrandService() throws SQLException {
    }

    public void register(Brand brand) throws SQLException {
        int result = brandRepository.save(brand);
        if(result != 0)
            System.out.println(brand.getName() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }

    public void changeBrand(int id) throws SQLException {
        System.out.println("Please enter your new name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your new website:");
        String website = scanner.nextLine();

        System.out.println("Please enter your new description:");
        String description = scanner.nextLine();
        int result = brandRepository.updateBrand(id,name,website,description);
        if(result != 0)
            System.out.println("successfully edited to database");
        else
            System.out.println("OOps! :(");
    }

    public void delete(int id) throws SQLException {
        int result = brandRepository.deleteBrand(id);
        if(result != 0)
            System.out.println("successfully deleted from database");
        else
            System.out.println("OOps! :(");
    }

}
