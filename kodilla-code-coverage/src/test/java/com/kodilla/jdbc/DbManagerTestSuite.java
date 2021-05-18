package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int numberOfUsers = 0;
        while (rs.next()) {
            numberOfUsers = rs.getInt("COUNT(*)");
        }
//        System.out.println(numberOfUsers);
        String sqlQuery = "SELECT U.ID, U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY USER_ID\n" +
                "HAVING COUNT(*) > 1;";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);
        int count = 0;
        while (rs.next()) {
            count = count + 1;
        }
//        System.out.println(count);
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('NewName', 'NewLastname')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES ( " + (numberOfUsers + 1) + ", 'My comment 1')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES ( " + (numberOfUsers + 1) + ", 'My comment 2')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('NewName1', 'NewLastname1')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES ( " + (numberOfUsers + 2) + ", 'My comment 3')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES ( " + (numberOfUsers + 2) + ", 'My comment 4')";
        statement.executeUpdate(sql);
        rs = statement.executeQuery(sqlQuery);
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(count + 2, counter);
    }
}