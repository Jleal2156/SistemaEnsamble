package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:33065/ensamble",
                "root",
                ""
            );
        } catch (Exception e) {
            System.out.println("Error conexión: " + e.getMessage());
            return null;
        }
    }
}
