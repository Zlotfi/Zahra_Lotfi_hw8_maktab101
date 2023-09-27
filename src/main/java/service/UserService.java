package service;

import entity.User;
import repository.UserRepository;

import java.sql.SQLException;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public UserService() throws SQLException {
    }

    public void register() throws SQLException {
        User user = new User(null,"zahra","zlotfi","zlotfi758@gmail.com","1380");
        int result = userRepository.save(user);
        if(result != 0)
            System.out.println(user.getName() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }
}
