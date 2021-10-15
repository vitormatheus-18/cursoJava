
import java.time.LocalDate;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jogador {
   
    private int Id;
    private String Nome;
    private String Apelido;
    private LocalDate Date;
    private int Numero;
    private String Posicao;
    private double Qualidade;
    private int Cartoes;
    private boolean Suspenso;
    
    
    public Jogador(){
    
    }

    public Jogador(int id, String nome, String apelido, LocalDate date ,int numero, String posicao,
    int qualidade, int cartoes, boolean suspenso) {

        Id = id;
        Nome = nome;
        Apelido = apelido;
        Date = date;
        Numero = numero;
        Posicao = posicao;
        Qualidade = qualidade;
        Cartoes = cartoes;
        Suspenso = suspenso;
        
    }
    
    public boolean verificaCondicaoJogo(){

        if(Cartoes >= 3){
            Suspenso = true;
            return false;
        }else 
           return true;
    }

    public void aplicarCartao(int quantidade){
        Cartoes += quantidade;

        if(Cartoes >= 3){
            Suspenso = true; 
        }
       
    }

    public void cumprirSuspensao(){
        Cartoes = 0;
        Suspenso = false;
    }

    public void sofrerLesao(){
        double novaQualidade = Qualidade;

        Random random = new Random();
        int probabilidade = random.nextInt(101);
        if(probabilidade < 5) {            
            novaQualidade = Qualidade - (15 * Qualidade / 100);
        } else if (probabilidade <= 15) {            
            novaQualidade = Qualidade - (10 * Qualidade / 100);
        } else if (probabilidade <= 30) {            
            novaQualidade = Qualidade - (5 * Qualidade / 100);
        } else if (probabilidade <= 60) {            
            novaQualidade = Qualidade - 2;
        } else if (probabilidade <= 100) {            
            novaQualidade = Qualidade - 1;
        }

        if (novaQualidade >= 0) {
            Qualidade = novaQualidade;
        } else {
            Qualidade = 0;
        }
    }

    public void Training() {
        double novaQualidade = Qualidade;

        Random random = new Random();
        int probabilidade = random.nextInt(101);
        if(probabilidade < 5) {
            novaQualidade = Qualidade + 5;
        } else if (probabilidade <= 15) {
            novaQualidade = Qualidade + 4;
        } else if (probabilidade <= 30) {
            novaQualidade = Qualidade + 3;
        } else if (probabilidade <= 60) {
            novaQualidade = Qualidade + 2;
        } else if (probabilidade <= 100) {
            novaQualidade = Qualidade + 1;
        }

        if (novaQualidade <= 100) {
            Qualidade = novaQualidade;            
        } else {
            Qualidade = 100;
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String apelido) {
        Apelido = apelido;
    }

    public LocalDate getDate() {
        return Date;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String posicao) {
        Posicao = posicao;
    }

    public double getQualidade() {
        return Qualidade;
    }

    public void setQualidade(int qualidade) {
        Qualidade = qualidade;
    }

    public int getCartoes() {
        return Cartoes;
    }

    public void setCartoes(int cartoes) {
        Cartoes = cartoes;
    }

    public boolean isSuspenso() {
        return Suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        Suspenso = suspenso;
    }

    private void setDate(LocalDate date) {
        this.Date = date;
    }




}
