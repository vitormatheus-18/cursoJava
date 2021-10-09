import javax.swing.JOptionPane;
public class Cliente {
    private String Nome;
    private String Cpf;
    private String Sobrenome;

    public Cliente() {}

    
    public Cliente(String nome, String cpf, String sobrenome) {
        Nome = nome;
        setCpf(cpf);
        Sobrenome = sobrenome;
    }    
    
    public void MostrarNome(){
        JOptionPane.showMessageDialog(null, "Cliente: " + Nome + " " + Sobrenome);
    }
    
    public String getNomeCompleto() {
        return Nome + " " + Sobrenome;
    }
    
    public String getCpf() {
        return Cpf;
    }
    
    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }
}
