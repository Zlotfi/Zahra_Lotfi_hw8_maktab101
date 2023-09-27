package service;

import entity.Category;
import entity.User;
import repository.CategoryRepository;

import java.sql.SQLException;

public class CategoryService {

    private final CategoryRepository categoryRepository = new CategoryRepository();

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
}
