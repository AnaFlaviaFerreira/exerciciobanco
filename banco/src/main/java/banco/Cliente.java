package banco;

public class Cliente implements java.io.Serializable{
    private String nome;
    private String dataNascimento;

    public Cliente(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String toString() {
        return "Cleinet [nome=" + nome + " - data nascimento=" + dataNascimento +"]";
    }
    
}
