package Player;
import javax.swing.JOptionPane;

public class Jogador {
   
    private int Id;
    private String Nome;
    private String Apelido;
    // private date DataDeNascimento;
    private int Numero;
    private String Posicao;
    private int Qualidade;
    private int Cartoes;
    private boolean Suspenso;
    
    
    public Jogador(){
    
    }

    public Jogador(int id, String nome, String apelido, 
    int numero, String posicao,
    int qualidade, int cartoes, boolean suspenso) {

        Id = id;
        Nome = nome;
        Apelido = apelido;
        
        Numero = numero;
        Posicao = posicao;
        Qualidade = qualidade;
        Cartoes = cartoes;
        Suspenso = suspenso;
    }



    public verficaCondicaoJogo(boolean suspenso, int cartoes){
        Suspenso = suspenso;
        Cartoes = cartoes;

        JOptionPane.showMessageDialog(null,  "Este Jogador posssui " + Cartoes + "ele está suspenso?" + Suspenso, "Resultado", JOptionPane.PLAIN_MESSAGE);

    }

}
