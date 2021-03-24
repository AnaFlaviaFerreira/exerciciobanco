package banco;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;*/

public abstract class DAOFactory {
    public static final int MYSQL = 1;
    public static final int MONGODB = 2;

    public static ClienteDAO getClienteDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
        case MYSQL: 
            return new MysqlClienteDAO();
            break;
        case MONGODB: 
            return new MongodbClienteDAO();
            break;
        default: 
            return null;
        }
  }
}
