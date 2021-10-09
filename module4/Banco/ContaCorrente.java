import java.time.LocalDate;

import javax.swing.JOptionPane;

public class ContaCorrente {
    private int NumeroConta;    
    public Cliente Cliente;
    private double Saldo;
    private LocalDate Date;

    public ContaCorrente() {}

    
    
    public ContaCorrente(int numeroConta, Cliente nomeCliente, double saldo, LocalDate date){
        setNumeroConta(numeroConta);
        Cliente = nomeCliente;
        Saldo = saldo;
        setDate(date);
        
    }
    
    public void Depositar(double valor) {
        Saldo += valor;
        JOptionPane.showMessageDialog(null, Cliente.getNomeCompleto() +  ": Depósito de $" + valor);
        ExibirExtrato();
    }
    
    public void Sacar(double valor) {
        if(Saldo > valor) {
            Saldo -= valor;
            JOptionPane.showMessageDialog(null, Cliente.getNomeCompleto() + ": Saque de $" + valor);
            ExibirExtrato();
        } else {
            JOptionPane.showMessageDialog(null, "Desculpe, mas seu saldo é insuficiente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ExibirExtrato() {
        JOptionPane.showMessageDialog(null, Cliente.getNomeCompleto() + " seu saldo é " + Saldo);
    }
    
    public static void Transferir(ContaCorrente contaCor1 ,ContaCorrente contaCor2, double valor) {
        if(valor > 0) {
            if(contaCor1.Saldo > valor) {
                contaCor1.Sacar(valor);
                contaCor2.Depositar(valor);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo é insuficiente!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inválido!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int getNumeroConta() {
        return NumeroConta;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.NumeroConta = numeroConta;
    }
    
    public LocalDate getDate() {
        return Date;
    }


    public void setDate(LocalDate date) {
        this.Date = date;
    }
}