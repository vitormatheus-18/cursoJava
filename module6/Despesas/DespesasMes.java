public class DespesasMes {
    private int Mes;
    private float Valor;   
    
    public DespesasMes() {
    }

    public DespesasMes(int mes, float valor) {
        Mes = mes;
        Valor = valor;
    }

    public int getMes() {
        return Mes;
    }

    public float getValor() {
        return Valor;
    }    
}