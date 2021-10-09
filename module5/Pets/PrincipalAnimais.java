package Pets;

import javax.swing.JOptionPane;

public class PrincipalAnimais {
   //Obs: Deixei idade como string por não precisar realizar cálculo
    
    public static void main(String[] args) {
        String nomeDog = JOptionPane.showInputDialog(null, "Qual o nome do cachorro?");

        String idade1 = JOptionPane.showInputDialog(null, "Qual a idade do cachorro?");
        // int idade1 = Integer.parseInt(idadeDog);

        Dog dog = new Dog(nomeDog, idade1);
        dog.emitirSom();

        String nomeGato = JOptionPane.showInputDialog(null, "Qual o nome do gato?");

        String idade2 = JOptionPane.showInputDialog(null, "Qual a idade do gato?");
        // int idade2 = Integer.parseInt(idadeGato);

        Gato gato = new Gato(nomeGato, idade2);
        gato.emitirSom();

        JOptionPane.showMessageDialog(null, "Finalizando o cadastro do seu pet." , "encerrando", JOptionPane.PLAIN_MESSAGE);
    }
}
