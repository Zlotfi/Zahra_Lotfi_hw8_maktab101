package repository;

import connection.JdbcConnection;
import entity.Product;
import entity.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductRepository {

    JdbcConnection jdbcConnection = new JdbcConnection();
    Connection connection = jdbcConnection.getConnection();

    public ProductRepository() throws SQLException {
    }

    public int save(Product product) throws SQLException {
        String add = "INSERT INTO product(name,createdate)VALUES(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDate(2, (Date) product.getCreateDate());
        int result = preparedStatement.executeUpdate();
        return result;
    }
}
