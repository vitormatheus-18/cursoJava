import java.util.Scanner;  
public class estadio{
    public static void main(String[] args) {
        int categoriaA = 50;  
        int categoriaB = 30;
        int categoriaC = 20; 
        
        System.out.println("Seja bem vindo a bilheteria");

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos ingressos forma vendidos no setor A?");
        int rendaA = input.nextInt() * categoriaA ;  
        
        System.out.println("Quantos ingressos forma vendidos no setor B?");
        int rendaB = input.nextInt() * categoriaB ; 

        System.out.println("Quantos ingressos forma vendidos no setor C?");
        int rendaC = input.nextInt() * categoriaC ;
    
        int rendaGeral = rendaA + rendaB + rendaC;
        System.out.println("Renda geral: " + rendaGeral);
    }
}