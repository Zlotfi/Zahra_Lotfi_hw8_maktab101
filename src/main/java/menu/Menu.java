package menu;

import entity.Brand;
import entity.User;
import service.BrandService;
import service.UserService;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService = new UserService();
    private final BrandService brandService = new BrandService();

    public Menu() throws SQLException {
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
        if (user == null && !user.getPassword().equals(password))
            System.out.println("you enter a username and password incorrect");
        else {
            System.out.println("============================================");
            System.out.println("1- brand");
            System.out.println("2- category");
            System.out.println("3- product");
            System.out.println("4- shareholder");
            System.out.println("5- Exit");
            int number = scanner.nextInt();
            scanner.nextLine();


        }
    }
}
