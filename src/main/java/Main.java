import menu.Menu;
import service.BrandService;
import service.ProductService;
import service.ShareHolderService;
import service.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
//        UserService userService = new UserService();
//        userService.register();
//        CategoryService categoryService = new CategoryService();
//        categoryService.register();
//
//        ProductService productService = new ProductService();
//        productService.register();
//        BrandService brandService = new BrandService();
//        brandService.register();
//        ShareHolderService shareHolderService = new ShareHolderService();
//        shareHolderService.register();
//        UserService userService = new UserService();
//        userService.find();
//        userService.changeName();
//        userService.delete();
        Menu menu = new Menu();
        menu.publicMenu();
    }
}
