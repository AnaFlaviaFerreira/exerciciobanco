package banco;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class MysqlClienteDAO implements ClienteDAO{
    private Connection conexao;

    public MysqlClienteDAO() {
        this.conexao = new MysqlDAOFactory().getConnection();
    }

    @Override
    public int insert(Cliente cli) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("insert into ClienteDAO (nome,dataNascimento) values (,?,?)");
            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getDataNascimento());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public boolean delete(Cliente cli) {
        return false;
    }

    @Override
    public Cliente find(Cliente id) {
        try {
            PreparedStatement stmt = this.conexao.prepareStatement("select * from cliente where nome=?");
            stmt.setString(1, id.getNome());
            ResultSet rs = stmt.executeQuery();
            id.setNome(rs.getString("nome"));
            id.setDataNascimento(rs.getString("dataNascimento"));
            rs.close();
            stmt.close();
            
            return id;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean update(Cliente cli) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("update cliente set nome=?, dataNascimento=? where nome=?");
            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getDataNascimento());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
             throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public List<Cliente> select() {
        try {
            List<Cliente> clientes = new ArrayList<Cliente>();
            PreparedStatement stmt = this.conexao.prepareStatement("select * from cliente");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Cliente cli = new Cliente();
                cli.setNome(rs.getString("nome"));
                cli.setDataNascimento(rs.getString("dataNascimento"));

                clientes.add(cli);
            }
            rs.close();
            stmt.close();
            
            return clientes;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
