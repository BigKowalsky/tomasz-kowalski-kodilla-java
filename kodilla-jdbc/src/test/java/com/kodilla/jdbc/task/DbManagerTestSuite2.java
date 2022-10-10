package com.kodilla.jdbc.task;


import com.kodilla.jdbc.tasks.DbManager2;
import org.junit.jupiter.api.Test;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DbManagerTestSuite2 {
    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager2 dbManager2 = DbManager2.getInstance();

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER " +
                "FROM USERS U " +
                "JOIN POSTS P ON U.ID = P.USER_ID " +
                "GROUP BY USER_ID " +
                "HAVING POSTS_NUMBER > 1;";
        Statement statement = dbManager2.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }
}
