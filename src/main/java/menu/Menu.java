package menu;

import entity.User;
import service.UserService;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService = new UserService();

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
            case 1 -> System.out.println("Sign in");
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
}
