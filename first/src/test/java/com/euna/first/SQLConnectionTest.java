package com.euna.first;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class SQLConnectionTest {
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://127.0.0.1:3306/first";
    private static final String USER = "euna";
    private static final String PW = "dmsdk2";
    
    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        
       try(Connection conn = DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(conn);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
