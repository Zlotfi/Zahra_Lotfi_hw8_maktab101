package repository;

import connection.JdbcConnection;
import entity.ShareHolder;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShareHolderRepository {

    JdbcConnection jdbcConnection = new JdbcConnection();
    Connection connection = jdbcConnection.getConnection();

    public ShareHolderRepository() throws SQLException {
    }

    public int save(ShareHolder shareHolder) throws SQLException {
        String add = "INSERT INTO shareholder(name,phoneNumber,nationalCode)VALUES(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1, shareHolder.getName());
        preparedStatement.setInt(2, shareHolder.getPhoneNumber());
        preparedStatement.setString(3, shareHolder.getNationalCode());
        int result = preparedStatement.executeUpdate();
        return result;
    }
}
