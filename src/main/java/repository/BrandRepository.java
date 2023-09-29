package repository;

import connection.JdbcConnection;
import entity.Brand;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BrandRepository {
    private final Connection connection;

    public BrandRepository(Connection connection){
        this.connection = connection;
    }

    public int save(int id , String name,String website, String description) throws SQLException {
        String add = "INSERT INTO brandid,name,website,description VALUES ?,?,?,?";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, website);
        preparedStatement.setString(4,description);
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public int updateBrand(int id,String name,String website,String description) throws SQLException {
        String query = "UPDATE brand SET (name = ?,website = ?,description = ?) WHERE (id = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,website);
        preparedStatement.setString(3,description);
        preparedStatement.setInt(4,id);
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public int deleteBrand(int id) throws SQLException {
        String query = "DELETE FROM brand WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        int result = preparedStatement.executeUpdate();
        return result;
    }
}
