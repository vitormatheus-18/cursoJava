package Employee;

public class Funcionario {
    public String Nome;
    public String Sobrenome;
    private int HorasTrabalhadas;
    private double ValorPorHora;

    public Funcionario() {}

    public Funcionario(String nome, String sobrenome) {
        Nome = nome;
        Sobrenome = sobrenome;
    }

    public void NomeCompleto() {
        System.out.println(Nome + " " + Sobrenome);
    }

    public void CalcularSalario() {
        System.out.println("Salário: $" + HorasTrabalhadas * ValorPorHora);
    }

    public void IncrementarHoras(int horas) {
        ValorPorHora += horas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        HorasTrabalhadas = horasTrabalhadas;
    }

    public void setValorPorHora(double valorPorHora) {
        ValorPorHora = valorPorHora;
    }

}
