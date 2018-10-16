package lab10;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

import java.sql.DriverManager;
import java.sql.SQLException;

myDatadase myconnect
public class myDatabase {
    public static void main(String[] args) {
        connectDB();

    }//main
    private Connection connect(){
        Connection conn = null;



    private static void connectDB() {
        Connection conn = null;
            try {
                //db parameters
                String url = "jdbc:sqlite:D:\\361211760039giithub\\src\\lab10\\myData.db";
                conn = DriverManager.getConnection(url);
                System.out.println("Database is connected.");

            try {
                //db parameters
                String url = "jdbc:sqlite:D:\\361211760039giithub\\src\\lab10\\myData.db";
                conn = DriverManager.getConnection(url);
                System.out.println("Database is connected.");
            }catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("can not connecting to Database");
            }finally {
                try {
                    if (conn != null)
                        conn.close();
                }catch (SQLException ex){
                    ex.printStackTrace();

                }

    }
    }//connectDB
            catch (SQLException e) {
                e.printStackTrace();
            }
        }//class
