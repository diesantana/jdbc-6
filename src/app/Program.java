package app;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnectionDb();
//        PreparedStatement preparedSt = null;

        DB.closeConcection();
        System.out.println("Terminei");
        
    }
}
