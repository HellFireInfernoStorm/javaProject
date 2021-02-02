
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hell
 */
public class DBConnect {

    public Connection Connect() {
        Connection con = null;
        try {
            String url = "jdbc:derby://localhost:1527/HMS";
            con = DriverManager.getConnection(url, "HMS", "HMS");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
