package org.zerock.board.service;


import lombok.Cleanup;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.*;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml")
public class TestService {

    @Autowired
    private Test1 test;

    @Test
    public void test(){
        log.info(test);
        test.tests();
    }

    @Test
    public void test2() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");

        @Cleanup Connection con = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/webdb",
                "webuser",
                "webuser");

        @Cleanup PreparedStatement pstmt =
                con.prepareStatement("select  now()");

        @Cleanup ResultSet resultSet = pstmt.executeQuery();

        resultSet.next();
        System.out.println(resultSet.getString(1));

    }
}
