package banco;

public class ContaCorrente extends Conta{
    public double limite;

    public ContaCorrente(double saldo, int numero, Cliente cliente, double limite) {
        super(saldo, numero, cliente);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }      
}
