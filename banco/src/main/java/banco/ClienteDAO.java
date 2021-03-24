package banco;

import java.util.List;

public interface ClienteDAO {
    public int insert(Cliente cli);
    public boolean delete(Cliente cli);
    public Cliente find(Cliente id);
    public boolean update(Cliente cli);
    public List<Cliente> select();
}
