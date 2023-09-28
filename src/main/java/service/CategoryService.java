package service;

import entity.Category;
import entity.User;
import repository.CategoryRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class CategoryService {

    private final CategoryRepository categoryRepository = new CategoryRepository();
    Scanner scanner = new Scanner(System.in);

    public CategoryService() throws SQLException {
    }

    public void register() throws SQLException {
        Category category = new Category(null,"clothing","All kinds of children's, women's and men's clothes");
        int result = categoryRepository.save(category);
        if(result != 0)
            System.out.println(category.getName() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }

    public void changeCategory(int id) throws SQLException {
        System.out.println("Please enter your new name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your new description:");
        String description = scanner.nextLine();
        int result = categoryRepository.updateCategory(id,name,description);
        if(result != 0)
            System.out.println("successfully edited to database");
        else
            System.out.println("OOps! :(");
    }

    public void delete(int id) throws SQLException {
        int result = categoryRepository.deleteCategory(id);
        if(result != 0)
            System.out.println("successfully deleted from database");
        else
            System.out.println("OOps! :(");
    }
}
