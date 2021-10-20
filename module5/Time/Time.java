import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Time{
        
    private String Nome;
    private String Apelido;
    private LocalDate Fundacao;
    public ArrayList<JogadorTime> Plantel;
    public ArrayList<JogadorTime> Relacionados;
    
    
    public Time(){
        
    }
    
    public Time(String nome, String apelido, LocalDate fundacao, ArrayList<JogadorTime> plantel, ArrayList<JogadorTime> relacionados) {
        Nome = nome;
        Apelido = apelido;
        Fundacao = fundacao;
        Plantel = plantel;
        Relacionados = relacionados;
    }

    public ArrayList<JogadorTime> relacionarJogadores(){
        List jogadores = Plantel.stream() 
                                .sorted(Comparator.comparing(JogadorTime::getQualidade))
                                .limit(11)
                                .collect(Collectors.toList());
        Relacionados = new ArrayList<JogadorTime>(jogadores);
        return Relacionados;
                                
      
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
    


}