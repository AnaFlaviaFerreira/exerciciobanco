package banco;

public class ContaPoupanca extends Conta{
    public String dataAniversario;

    public ContaPoupanca(double saldo, int numero, Cliente cliente, String dataAniversario) {
        super(saldo, numero, cliente);
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }   
}
