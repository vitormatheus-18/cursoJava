
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Jogador {
   
    private int Id;
    private String Nome;
    private String Apelido;
    LocalDate Date;
    private int Numero;
    private String Posicao;
    private int Qualidade;
    private int Cartoes;
    private boolean Suspenso;
    
    
    public Jogador(){
    
    }

    public Jogador(int id, String nome, String apelido, LocalDate date ,int numero, String posicao,
    int qualidade, int cartoes, boolean suspenso) {

        Id = id;
        Nome = nome;
        Apelido = apelido;
        setDate(date);
        Numero = numero;
        Posicao = posicao;
        Qualidade = qualidade;
        Cartoes = cartoes;
        Suspenso = suspenso;

    }

    private void setDate(LocalDate date) {
        this.Date = date;
    }

    public void verficaCondicaoJogo(int cartoes, boolean suspenso){

        Cartoes = cartoes;
        Suspenso = suspenso;

        if(Cartoes >= 3){
            Suspenso = true;
            System.out.println(Numero + " - " + Nome + " - " + LocalDate.now() + ", Condição: este Jogador está suspenso");
        }else 
            System.out.println(Numero + " - " + Nome + " - " + LocalDate.now() + ", Condição: este Jogador está disponível");
    }



}
