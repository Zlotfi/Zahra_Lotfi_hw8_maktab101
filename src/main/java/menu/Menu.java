package menu;

import entity.Brand;
import entity.User;
import service.*;
import utility.ApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService = ApplicationContext.getUserService();
    private final BrandService brandService = ApplicationContext.getBrandService();
    private final CategoryService categoryService = ApplicationContext.getCategoryService();
    private final ProductService productService = ApplicationContext.getProductService();
    private final ShareHolderService shareHolderService = new ShareHolderService();

    public Menu(){
    }

    public void publicMenu() throws SQLException {
        System.out.println("****Welcome****");
        System.out.println("1- Sign in");
        System.out.println("2- Sign up");
        System.out.println("3- Exit");
        System.out.println("Enter your select:");
        int select = scanner.nextInt();
        scanner.nextLine();
        switch (select){
            case 1 -> enter();
            case 2 -> register();
            case 3 -> System.out.println("Exit");
            default -> System.out.println("ERROR");
        }
    }

    public void register() throws SQLException {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        User user = new User(null, name,username,email,password);
        userService.register(user);
    }

    public void enter() throws SQLException {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        User user = userService.find(username);
        if (user != null && !user.getPassword().equals(password))
            System.out.println("you enter a username and password incorrect");
        else {
            boolean isTrue = true;

            System.out.println("============================================");
            System.out.println("1- brand");
            System.out.println("2- category");
            System.out.println("3- product");
            System.out.println("4- shareholder");
            System.out.println("5- Exit");
            int number = scanner.nextInt();
            scanner.nextLine();
            while (isTrue){
            switch (number){
                case 1 -> {
                    System.out.println("==================================");
                    System.out.println("1- Add brand");
                    System.out.println("2- Update brand");
                    System.out.println("3- Delete brand");
                    System.out.println("4- Exit");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    switch (num) {
                        case 1 -> {
                            assert user != null;
                            brandService.register(user.getId());
                        }
                        case 2 -> {
                            assert user != null;
                            brandService.changeBrand(user.getId());
                        }
                        case 3 -> {
                            assert user != null;
                            brandService.delete(user.getId());
                        }
                        case 4 -> isTrue = false;
                        default -> System.out.println("error");
                    }
                }
                case 2 -> {
                    System.out.println("==================================");
                    System.out.println("1- Add category");
                    System.out.println("2- Update category");
                    System.out.println("3- Delete category");
                    System.out.println("4- Exit");
                    int num1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (num1){
                        case 1 -> {
                            assert user != null;
                            categoryService.register(user.getId());
                        }
                        case 2 -> {
                            assert user != null;
                            categoryService.changeCategory(user.getId());
                        }
                        case 3 -> {
                            assert user != null;
                            categoryService.delete(user.getId());
                        }
                        case 4 -> isTrue = false;
                        default -> System.out.println("error");
                    }
                }
                case 3 -> {
                    System.out.println("==================================");
                    System.out.println("1- Add product");
                    System.out.println("2- Update product");
                    System.out.println("3- Delete product");
                    System.out.println("4- Exit");
                    int num2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (num2){
                        case 1 -> {
                            assert user != null;
                            productService.register(user.getId());
                        }
                        case 2 -> {
                            assert user != null;
                            productService.changeProduct(user.getId());
                        }
                        case 3 -> {
                            assert user != null;
                            productService.delete(user.getId());
                        }
                        case 4 -> isTrue = false;
                        default -> System.out.println("error");
                    }
                }
                case 4 -> {
                    System.out.println("==================================");
                    System.out.println("1- Add shareholder");
                    System.out.println("2- Update shareholder");
                    System.out.println("3- Delete shareholder");
                    System.out.println("4- Exit");
                    int num3 = scanner.nextInt();
                    scanner.nextLine();
                    switch (num3){
                        case 1 -> {
                            assert user != null;
                            shareHolderService.register(user.getId());
                        }
                        case 2 -> {
                            assert user != null;
                            shareHolderService.changeShareHolder(user.getId());
                        }
                        case 3 -> {
                            assert user != null;
                            shareHolderService.delete(user.getId());
                        }
                        case 4 -> isTrue = false;
                        default -> System.out.println("error");
                    }
                }
                case 5 -> isTrue = false;
                default -> System.out.println("ERROR");
            }
            }

        }
    }
}
