import java.util.Scanner;  
public class Estadio{
    
    public static void main(String[] args) {
        int categoriaA = 50;  
        int categoriaB = 30;
        int categoriaC = 20; 
        
        System.out.println("---- Verifique a renda gerada para determinada partida do seu clube ----");
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos ingressos foram vendidos na arquibancada A?");
        int rendaA = input.nextInt() * categoriaA ;  
        
        System.out.println("Quantos ingressos foram vendidos na arquibancada B?");
        int rendaB = input.nextInt() * categoriaB ; 

        System.out.println("Quantos ingressos foram vendidos na arquibancada C?");
        int rendaC = input.nextInt() * categoriaC ;
    
        int rendaGeral = rendaA + rendaB + rendaC;
        System.out.println("Renda geral:" + rendaGeral);
    }
}