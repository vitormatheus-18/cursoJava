import javax.swing.JOptionPane;

public class Retangulo {
    public static void main(String[] args) {
    
        NovoRetangulo retangulo1 = new NovoRetangulo();
        retangulo1.setLados(10, 5);
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        retangulo1.setLado2(7);
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();

        NovoRetangulo retangulo2 = new NovoRetangulo();
        retangulo2.setLados(20, 5);
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();
        retangulo2.setLado2(6);
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();

        NovoRetangulo retangulo3 = new NovoRetangulo();
        retangulo3.setLados(30, 5);
        retangulo3.calcularArea();
        retangulo3.calcularPerimetro();
        retangulo3.setLado2(5);
        retangulo3.calcularArea();
        retangulo3.calcularPerimetro();

        NovoRetangulo retangulo4 = new NovoRetangulo();
        retangulo4.setLados(40, 5);
        retangulo4.calcularArea();
        retangulo4.calcularPerimetro();
        retangulo4.setLado2(4);
        retangulo4.calcularArea();
        retangulo4.calcularPerimetro();

        NovoRetangulo retangulo5 = new NovoRetangulo();
        retangulo5.setLados(50, 5);
        retangulo5.calcularArea();
        retangulo5.calcularPerimetro();
        retangulo5.setLado2(3);
        retangulo5.calcularArea();
        retangulo5.calcularPerimetro();
    }
    
}