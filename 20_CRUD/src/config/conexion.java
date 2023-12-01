package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;
    
    public conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/demo1?characterEncoding=UTF-8","root","admin");
        }catch (Exception e){
            System.out.println("ERROR CONEXION "+e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}