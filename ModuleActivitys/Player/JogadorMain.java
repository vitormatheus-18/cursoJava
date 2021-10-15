package Player;
public class JogadorMain{
    
    public static void main(String[] args) {
        Jogador j1 = new Jogador(1, "Mailson", "paredão", 1, "Goleiro", 1, 0, false );
        Jogador j2 = new Jogador(2, "Ewerthon", "N", 66, "LateralD", 1, 0, false );
        Jogador j3 = new Jogador(3, "Chico", "N", 4, "Zagueiro", 1, 2, false );
        Jogador j4 = new Jogador(4, "Sabino", "xerife", 35, "Zagueiro", 1, 0, false );
        Jogador j5 = new Jogador(5, "Sander", "N", 6, "lateralE", 1, 0, false );
        Jogador j6 = new Jogador(6, "Marcão", "N", 77, "Volante", 1, 3, false );
        Jogador j7 = new Jogador(7, "Hernanes", "profeta", 8, "Volante", 1, 0, false );
        Jogador j8 = new Jogador(8, "José Welison", "N", 14, "Volante", 1, 1, false );
        Jogador j9 = new Jogador(9, "Gustavo", "aspira", 10, "Meio-campo", 1, 0, false );
        Jogador j10 = new Jogador(10, "Mikael", "goleador", 99, "Atacante", 1, 0, false );
        Jogador j11 = new Jogador(11, "Paulinho Moccelin", "N", 94, "Atacante", 1, 0, false );
        
        j1.verficaCondicaoJogo();
    }

}
