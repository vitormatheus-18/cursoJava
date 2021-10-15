package Employee;
import java.util.ArrayList;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luis", "Silva");
        funcionario.setHorasTrabalhadas(10);
        funcionario.setValorPorHora(25.50);

        funcionario.NomeCompleto();
        funcionario.CalcularSalario();
        funcionario.IncrementarHoras(8);
        funcionario.CalcularSalario();
        
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("Mateus","Antonio"));
        funcionarios.add(new Funcionario("Alanda","Aquino"));
        funcionarios.add(new Funcionario("Danilo","Miguel"));
        funcionarios.add(new Funcionario("Diogenes","Oliveira"));
        funcionarios.add(new Funcionario("Isaias","Cleiton"));
        funcionarios.add(new Funcionario("Karla","Letícia"));
        funcionarios.add(new Funcionario("Maria","Cecília"));
        funcionarios.add(new Funcionario("Shayanne","Naalanda"));
        funcionarios.add(new Funcionario("Vitor","Matheus"));
    }
}
