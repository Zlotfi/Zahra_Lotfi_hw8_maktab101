package repository;

import connection.JdbcConnection;
import entity.Product;
import entity.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductRepository {
    private final Connection connection;

    public ProductRepository(Connection connection){
        this.connection = connection;
    }

    public int save(int id,String name,String createdate) throws SQLException {
        String add = "INSERT INTO product(id,name,createdate)VALUES(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3,createdate);
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public int updateProduct(int id,String name,String createdate) throws SQLException {
        String query = "UPDATE product SET name = ?,createdate = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,createdate);
        preparedStatement.setInt(3,id);
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public int deleteProduct(int id) throws SQLException {
        String query = "DELETE FROM product WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        int result = preparedStatement.executeUpdate();
        return result;
    }
}
