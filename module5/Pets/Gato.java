package Pets;
import javax.swing.JOptionPane;

public class Gato {
    
    private String Nome;
    private String Idade;

    public Gato(String nome, String idade) {
        Nome = nome;
        Idade = idade;
    }


    public String getIdade() {
        return Idade;
    }


    public void setIdade(String idade) {
        this.Idade = idade;
    }


    public String getNome() {
        return Nome;
    }


    public void setNome(String nome) {
        this.Nome = nome;
    }


    public void emitirSom(){
        JOptionPane.showMessageDialog(null, "MIAU!", "PET", JOptionPane.PLAIN_MESSAGE);

    }
}
