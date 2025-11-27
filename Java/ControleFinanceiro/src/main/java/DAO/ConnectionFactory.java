package DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost:3306/controle_financeiro";
    private static final String USER = "root";
    private static final String PASS = "1_Paocommortadela";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar ao MySQL: " + e.getMessage());
        }
    }
}
