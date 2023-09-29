package service;

import entity.Brand;
import entity.User;
import repository.BrandRepository;
import utility.Validation;

import java.sql.SQLException;
import java.util.Scanner;

public class BrandService {

    private final BrandRepository brandRepository;
    Scanner scanner = new Scanner(System.in);

    public BrandService(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }

    public void register(int id) throws SQLException {
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("please enter your website:");
        String website = null;
        boolean flag = true;
        while (flag) {
            website = scanner.nextLine();
            if (Validation.isValidWebsiteWithRegex(website))
                flag = false;
            else
                System.out.println("Please enter a valid website");
        }
        System.out.println("please enter your description:");
        String description = scanner.nextLine();
        int result = brandRepository.save(id,name,website,description);
        if(result != 0)
            System.out.println(name + " successfully added to database");
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
