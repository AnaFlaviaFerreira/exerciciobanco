package banco;
import java.sql.*;

public class MysqlDAOFactory extends DAOFactory{
    public static final String DBURL= "jdbc:mysql://localhost/contas";

    public static Connection getConnection() {
        try {
            String username = "lagi";
            String password = "lagi";
            return DriverManager.getConnection(DBURL,username,password);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
    public ClienteDAO getClienteDAO() {
        return new MysqlClienteDAO();
    }
    public ContaDAO getContaDAO() {
        return new MysqlContaDAO();
    }
    public ContaCorrenteDAO getContaCorrenteDAO() {
        return new MysqlContaCorrenteDAO();
    }
    public ContaPoupancaDAO getContaPoupancaDAO() {
        return new MysqlContaPoupancaDAO();
    }

}
