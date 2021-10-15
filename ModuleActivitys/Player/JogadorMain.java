import java.time.LocalDate;
// import java.util.ArrayList;

public class JogadorMain{

    // public static void main(String[] args) {
    //     ArrayList<Jogador> jogador = new ArrayList<>();
        
    //     Jogador jogadores = new Jogador(1, "Mailson", "paredão", LocalDate.now(), 1, "Goleiro", 1, 0, false );
    //     jogador.add(jogadores);
    //     jogador.add(new Jogador(2,"Ewerthon", "N", LocalDate.now(), 66, "LateralD", 1, 0, false ));
    //     jogador.add(new Jogador(3, "Chico", "N", LocalDate.now(), 4, "Zagueiro", 1, 2, false ));
    //     jogador.add(new Jogador(4, "Sabino", "xerife", LocalDate.now(), 35, "Zagueiro", 1, 0, false ));
    //     jogador.add(new Jogador(5, "Sander", "N", LocalDate.now(), 6, "lateralE", 1, 0, false ));
    //     jogador.add(new Jogador(6, "Marcão", "N", LocalDate.now(), 77, "Volante", 1, 3, false));
    //     jogador.add(new Jogador(7, "Hernanes", "profeta", LocalDate.now(), 8, "Volante", 1, 0, false));
    //     jogador.add(new Jogador(8, "José Welison", "N", LocalDate.now(), 14, "Volante", 1, 1, false ));
    //     jogador.add(new Jogador(9, "Gustavo", "aspira", LocalDate.now(), 10, "Meio-campo", 1, 0, false));
    //     jogador.add(new Jogador(10, "Mikael", "goleador", LocalDate.now(), 99, "Atacante", 1, 0, false));
    //     jogador.add(new Jogador(11, "Paulinho Moccelin", "N", LocalDate.now(), 94, "Atacante", 1, 0, false ));


    
    public static void main(String[] args) {
        Jogador j1 = new Jogador(1, "Mailson", "paredão", LocalDate.now(), 1, "Goleiro", 1, 0, false );
        j1.verficaCondicaoJogo(0, false);
        Jogador j2 = new Jogador(2, "Ewerthon", "N", LocalDate.now(), 66, "LateralD", 1, 0, false );
        j2.verficaCondicaoJogo(0, false);
        Jogador j3 = new Jogador(3, "Chico", "N", LocalDate.now(), 4, "Zagueiro", 1, 2, false );
        j3.verficaCondicaoJogo(2, false);
        Jogador j4 = new Jogador(4, "Sabino", "xerife", LocalDate.now(), 35, "Zagueiro", 1, 0, false );
        j4.verficaCondicaoJogo(0, false);
        Jogador j5 = new Jogador(5, "Sander", "N", LocalDate.now(), 6, "lateralE", 1, 0, false );
        j5.verficaCondicaoJogo(0, false);
        Jogador j6 = new Jogador(6, "Marcão", "N", LocalDate.now(), 77, "Volante", 1, 3, false );
        j6.verficaCondicaoJogo(3, false);
        Jogador j7 = new Jogador(7, "Hernanes", "profeta", LocalDate.now(), 8, "Volante", 1, 0, false );
        j7.verficaCondicaoJogo(0, false);
        Jogador j8 = new Jogador(8, "José Welison", "N", LocalDate.now(), 14, "Volante", 1, 1, false );
        j8.verficaCondicaoJogo(1, false);
        Jogador j9 = new Jogador(9, "Gustavo", "aspira", LocalDate.now(), 10, "Meio-campo", 1, 0, false );
        j9.verficaCondicaoJogo(0, false);
        Jogador j10 = new Jogador(10, "Mikael", "goleador", LocalDate.now(), 99, "Atacante", 1, 0, false );
        j10.verficaCondicaoJogo(0, false);
        Jogador j11 = new Jogador(11, "Paulinho Moccelin", "N", LocalDate.now(), 94, "Atacante", 1, 0, false );
        j11.verficaCondicaoJogo(0, false);
        
    }

}
