package service;

import entity.User;
import repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserService {

    private final UserRepository userRepository = new UserRepository();
    Scanner scanner = new Scanner(System.in);

    public UserService() throws SQLException {
    }

    public void register(User user) throws SQLException {
        int result = userRepository.save(user);
        if(result != 0)
            System.out.println(user.getName() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }

    public User find(String username) throws SQLException {
        User user = userRepository.login(username);
        return user;
    }

    public void changeName(int id) throws SQLException {
        System.out.println("Please enter your new name:");
        String name = scanner.nextLine();
        int result = userRepository.updateName(name,id);
        if(result != 0)
            System.out.println("successfully edited to database");
        else
            System.out.println("OOps! :(");
    }

    public void delete(int id) throws SQLException {
        int result = userRepository.delete(id);
        if(result != 0)
            System.out.println("successfully deleted from database");
        else
            System.out.println("OOps! :(");
    }
}
