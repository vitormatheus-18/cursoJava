import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Flavia", "789.269.810-88", "Reis");
        ContaCorrente contaCor1 = new ContaCorrente(1, c1, 784, LocalDate.now());
        contaCor1.Cliente.MostrarNome();
        contaCor1.ExibirExtrato();
        contaCor1.Depositar(10);

        Cliente c2 = new Cliente("José", "584.695.610-65", "Silva");
        ContaCorrente contaCor2 = new ContaCorrente(2, c2, 1200, LocalDate.now());
        contaCor2.Cliente.MostrarNome();
        contaCor2.ExibirExtrato();


        contaCor1.Depositar(500);
        
        contaCor1.Sacar(200);
        
        ContaCorrente.Transferir(contaCor1, contaCor2, 500);
        
    }
}
