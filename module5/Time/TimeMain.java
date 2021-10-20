import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TimeMain{


    public static void main(String[] args) {
        
        
        ArrayList<JogadorTime> jogadores = new ArrayList<>();
        
        jogadores.add(new JogadorTime(1, "Mailson", "paredão", LocalDate.now(), 1, "Goleiro", 1, 0, false ));
        jogadores.add(new JogadorTime(2,"Ewerthon", "N", LocalDate.now(), 66, "LateralD", 1, 0, false ));
        jogadores.add(new JogadorTime(3, "Chico", "N", LocalDate.now(), 4, "Zagueiro", 1, 2, false ));
        jogadores.add(new JogadorTime(4, "Sabino", "xerife", LocalDate.now(), 35, "Zagueiro", 1, 0, false ));
        jogadores.add(new JogadorTime(5, "Sander", "N", LocalDate.now(), 6, "lateralE", 1, 0, false ));
        jogadores.add(new JogadorTime(6, "Marcão", "N", LocalDate.now(), 77, "Volante", 1, 3, false));
        jogadores.add(new JogadorTime(7, "Hernanes", "profeta", LocalDate.now(), 8, "Volante", 1, 0, false));
        jogadores.add(new JogadorTime(8, "José Welison", "N", LocalDate.now(), 14, "Volante", 1, 1, false ));
        jogadores.add(new JogadorTime(9, "Gustavo", "aspira", LocalDate.now(), 10, "Meio-campo", 1, 0, false));
        jogadores.add(new JogadorTime(10, "Mikael", "goleador", LocalDate.now(), 99, "Atacante", 1, 0, false));
        jogadores.add(new JogadorTime(11, "Paulinho Moccelin", "N", LocalDate.now(), 94, "Atacante", 1, 0, false ));
        jogadores.add(new JogadorTime(12, "Magrão", "paredão", LocalDate.now(), 1, "Goleiro", 1, 0, false ));
        jogadores.add(new JogadorTime(13, "Dutra", "N", LocalDate.now(), 66, "LateralD", 1, 0, false ));
        jogadores.add(new JogadorTime(14, "Durval", "N", LocalDate.now(), 4, "Zagueiro", 1, 2, false ));
        jogadores.add(new JogadorTime(15, "Adryelson", "xerife", LocalDate.now(), 35, "Zagueiro", 1, 0, false ));
        jogadores.add(new JogadorTime(16, "Moacir", "N", LocalDate.now(), 6, "lateralE", 1, 0, false ));
        jogadores.add(new JogadorTime(17, "Chumacero", "N", LocalDate.now(), 77, "Volante", 1, 3, false));
        jogadores.add(new JogadorTime(18, "Adriano", "profeta", LocalDate.now(), 8, "Volante", 1, 0, false));
        jogadores.add(new JogadorTime(19, "Ronaldo", "N", LocalDate.now(), 14, "Volante", 1, 1, false ));
        jogadores.add(new JogadorTime(20, "Thiago Neves", "aspira", LocalDate.now(), 10, "Meio-campo", 1, 0, false));
        jogadores.add(new JogadorTime(21, "André", "goleador", LocalDate.now(), 9, "Atacante", 1, 0, false));
        jogadores.add(new JogadorTime(22, "Trellez", "N", LocalDate.now(), 94, "Atacante", 1, 0, false ));
        jogadores.add(new JogadorTime(23, "Carlinhos Bala", "N", LocalDate.now(), 94, "Atacante", 1, 0, false ));
        
        
        ArrayList<JogadorTime> jogadores2 = new ArrayList<>();
        jogadores2.add(new JogadorTime(1, "Jordan", "N", LocalDate.now(), 1, "Goleiro", 95, 1, false));
        jogadores2.add(new JogadorTime(2, "Marcos Martins", "N", LocalDate.now(), 2, "Lateral Direito", 95, 1, false));
        jogadores2.add(new JogadorTime(3, "Breno Calixto", "N", LocalDate.now(), 3, "Zagueiro", 95, 1, false));
        jogadores2.add(new JogadorTime(4, "William Alves", "N", LocalDate.now(), 4, "Zagueiro", 95, 1, false));
        jogadores2.add(new JogadorTime(5, "Leonan", "N", LocalDate.now(), 6, "Lateral Esquerdo", 95, 1, false));
        jogadores2.add(new JogadorTime(6, "Maycon Lucas", "N", LocalDate.now(), 5, "Volante", 95, 1, false));
        jogadores2.add(new JogadorTime(7, "Vitinho", "N", LocalDate.now(), 8, "Volante", 95, 1, false));
        jogadores2.add(new JogadorTime(8, "Tarcísio", "N", LocalDate.now(), 7, "Meia", 95, 1, false));
        jogadores2.add(new JogadorTime(9, "Lelê", "N", LocalDate.now(), 10, "Meia", 95, 1, false));
        jogadores2.add(new JogadorTime(10, "Frank", "N", LocalDate.now(), 11, "Atacante", 95, 1, false));
        jogadores2.add(new JogadorTime(11, "Pipico", "N", LocalDate.now(), 9, "Atacante", 95, 1, false));
        jogadores2.add(new JogadorTime(12, "Jão", "N", LocalDate.now(), 12, "Goleiro", 95, 1, false));        
        jogadores2.add(new JogadorTime(13, "Willian", "N", LocalDate.now(), 13, "Zagueiro", 95, 1, false));
        jogadores2.add(new JogadorTime(14, "Ikaro", "N", LocalDate.now(), 14, "Zagueiro", 95, 1, false));
        jogadores2.add(new JogadorTime(15, "Matheus", "N", LocalDate.now(), 16, "Lateral Esquerdo", 95, 1, false));
        jogadores2.add(new JogadorTime(16, "Roosevelt", "N", LocalDate.now(), 15, "Volante", 95, 1, false));
        jogadores2.add(new JogadorTime(17, "Frederico", "N", LocalDate.now(), 18, "Volante", 95, 1, false));
        jogadores2.add(new JogadorTime(18, "Rafael", "N", LocalDate.now(), 17, "Meia", 95, 1, false));
        jogadores2.add(new JogadorTime(19, "Emanuel", "N", LocalDate.now(), 30, "Meia", 95, 1, false));
        jogadores2.add(new JogadorTime(20, "Alessandro", "N", LocalDate.now(), 21, "Atacante", 95, 1, false));
        jogadores2.add(new JogadorTime(21, "Danilo", "N", LocalDate.now(), 19, "Atacante", 95, 1, false));
        jogadores2.add(new JogadorTime(21, "Vitor", "N", LocalDate.now(), 29, "Atacante", 95, 1, false));
        jogadores2.add(new JogadorTime(22, "Lucas", "N", LocalDate.now(), 22, "Lateral Direito", 95, 1, false));
        
        Time time = new Time("Sport Recife ", " Leão da ilha", LocalDate.now(), jogadores, jogadores);
        Time time2 = new Time("Santa Cruz ", "filho do sport", LocalDate.now(), jogadores2, jogadores2);
        
        time.Plantel.forEach(treinar -> treinar.Training());
        time.relacionarJogadores();
        mostrarEscalacao(time.relacionarJogadores());

        time2.Plantel.forEach(treinar -> treinar.Training());
        time2.relacionarJogadores();
        mostrarEscalacao(time2.relacionarJogadores());
        
    }
    public static void mostrarEscalacao(ArrayList<JogadorTime> jogadores) {
        String mostrarJogadores = "";
        for(JogadorTime jogadorTime :jogadores) {
            mostrarJogadores += jogadorTime.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, mostrarJogadores, "Time", JOptionPane.PLAIN_MESSAGE);
    }
    
}
