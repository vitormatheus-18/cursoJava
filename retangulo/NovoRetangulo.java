import javax.swing.JOptionPane;

public class NovoRetangulo {
    private double Lado1;
    private double Lado2;
    private double Area;
    private double Perimetro;

    public NovoRetangulo() {};

    public NovoRetangulo(double lado1, double lado2){
        Lado1 = lado1;
        Lado2 = lado2;
    };
    
    public void calcularArea() {

        Area = (Lado1 * Lado2);
        JOptionPane.showMessageDialog(null,  "A área do retângulo é de: "+ Area, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }

    public void calcularPerimetro() {
        
        Perimetro = ((2*Lado1) + (2*Lado2));
        JOptionPane.showMessageDialog(null,  "O perimetro do retângulo é = "+ Perimetro, "Resultado", JOptionPane.PLAIN_MESSAGE);
        
    }

    public void setLados (double novo1, double novo2) {
        Lado1 = novo1;
        Lado2 = novo2;
    }

    public void setLado2(double valor) {
        Lado2 = valor;
    }

}