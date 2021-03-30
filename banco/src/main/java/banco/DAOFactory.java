package banco;

public abstract class DAOFactory {
    public static final int MYSQL = 1;
    public static final int MONGODB = 2;

    public abstract ClienteDAO getClienteDAO();
    public abstract ContaDAO getContaDAO();
    public abstract ContaCorrenteDAO getContaCorrenteDAO();
    public abstract ContaPoupancaDAO getContaPoupancaDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
        case MYSQL: 
            return new MysqlDAOFactory();
        case MONGODB: 
            return new MongodbDAOFactory();
        default: 
            return null;
        }
  }
}
