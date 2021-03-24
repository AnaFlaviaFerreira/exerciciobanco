package contas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    try {
        String url = "jdbc:mysql://localhost/test";
        String usuario = "lagi";
        String senha = "lagi";
        return DriverManager.getConnection(url, usuario, senha);
    } catch (SQLException e) {
        e.getMessage();
    }
    return null;
}
