
package Test_Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class latihan1 {
    static final String  DB_Url = "djbc:mysql://localhost:3306/db_unidha3";
    private static Connection Test_Konek;
    public static Connection DB_Konek() throws SQLException,ClassNotFoundException {
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);
            System.out.println ("Proses Deteksi Driver Berhasil");
            
            final java.sql.Connection tersambung =DriverManager.getConnection (DB_Url, "root","");
            System.out.println ("Koneksi database berhasil");
        }catch (final SQLException ex){
            System.out.println ("Koneksi database Gagal");
        }
    return Test_Konek;
    }
}