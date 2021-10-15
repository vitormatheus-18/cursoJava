import java.time.LocalDate;
import java.util.ArrayList;

public class JogadorMain{

    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador(1, "Mailson", "paredão", LocalDate.now(), 1, "Goleiro", 1, 0, false ));
        jogadores.add(new Jogador(2,"Ewerthon", "N", LocalDate.now(), 66, "LateralD", 1, 0, false ));
        jogadores.add(new Jogador(3, "Chico", "N", LocalDate.now(), 4, "Zagueiro", 1, 2, false ));
        jogadores.add(new Jogador(4, "Sabino", "xerife", LocalDate.now(), 35, "Zagueiro", 1, 0, false ));
        jogadores.add(new Jogador(5, "Sander", "N", LocalDate.now(), 6, "lateralE", 1, 0, false ));
        jogadores.add(new Jogador(6, "Marcão", "N", LocalDate.now(), 77, "Volante", 1, 3, false));
        jogadores.add(new Jogador(7, "Hernanes", "profeta", LocalDate.now(), 8, "Volante", 1, 0, false));
        jogadores.add(new Jogador(8, "José Welison", "N", LocalDate.now(), 14, "Volante", 1, 1, false ));
        jogadores.add(new Jogador(9, "Gustavo", "aspira", LocalDate.now(), 10, "Meio-campo", 1, 0, false));
        jogadores.add(new Jogador(10, "Mikael", "goleador", LocalDate.now(), 99, "Atacante", 1, 0, false));
        jogadores.add(new Jogador(11, "Paulinho Moccelin", "N", LocalDate.now(), 94, "Atacante", 1, 0, false ));

        for(Jogador jogador: jogadores){
            System.out.println(jogador.getNumero() + " - " + jogador.getNome() + " - " + jogador.getDate() + ", Condição: " + jogador.verificaCondicaoJogo());
        }
    }


}
