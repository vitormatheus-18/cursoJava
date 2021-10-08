import javax.swing.JOptionPane;

public class NovoCirculo {
    private double Raio;
    private double Area;
    private double Perimetro;

    public NovoCirculo() {
    }
    
    public NovoCirculo(double raio) {
        Raio = raio;
    }
    public void calcularArea() {
        
        Area = (Raio * Raio * 3.14);
        JOptionPane.showMessageDialog(null,  "A área do Círculo é de: "+ Area, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void calcularPerimetro() {
        
        Perimetro = (2 * Raio * 3.14);
        JOptionPane.showMessageDialog(null,  "O perimetro do Círculo é = "+ Perimetro, "Resultado", JOptionPane.PLAIN_MESSAGE);
        
    }
    
    public void setRaio(double raio) {
        Raio = raio;
    }
}