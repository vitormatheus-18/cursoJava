import javax.swing.JOptionPane;

public class Gato {
    
    private String Nome;
    private int Idade;

    public Gato(String nome, int idade) {
        Nome = nome;
        Idade = idade;
    }


    public int getIdade() {
        return Idade;
    }


    public void setIdade(int idade) {
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
