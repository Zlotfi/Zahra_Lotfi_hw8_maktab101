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
        preparedStatement.setString(2, shareHolder.getPhoneNumber());
        preparedStatement.setString(3, shareHolder.getNationalCode());
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public int updateShareHolder(int shareid,String name,String phonenumber,String nationalcode) throws SQLException {
        String query = "UPDATE shareholder SET (name = ?,phonenumber = ?,nationalcode = ?) WHERE shareid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,phonenumber);
        preparedStatement.setString(3,nationalcode);
        preparedStatement.setInt(4,shareid);
        int result = preparedStatement.executeUpdate();
        return result;
    }

    public int deleteShareHolder(int shareid) throws SQLException {
        String query = "DELETE FROM shareholder WHERE shareid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,shareid);
        int result = preparedStatement.executeUpdate();
        return result;
    }
}
