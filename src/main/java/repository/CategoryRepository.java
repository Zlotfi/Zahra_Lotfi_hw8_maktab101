package repository;

import connection.JdbcConnection;
import entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryRepository {
    private final Connection connection;

    public CategoryRepository(Connection connection){
        this.connection = connection;
    }

    public int save(int id,String name,String description) throws SQLException {
        String add = "INSERT INTO category(id,name,description)VALUES(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3,description);
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public int updateCategory(int id,String name,String description) throws SQLException {
        String query = "UPDATE category SET name = ?,description = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,description);
        preparedStatement.setInt(3,id);
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public int deleteCategory(int id) throws SQLException {
        String query = "DELETE FROM category WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        int result = preparedStatement.executeUpdate();
        return result;
    }
}
