public class DespesasDia extends DespesasMes {
    private int Dia;

    public DespesasDia(int mes, float valor, int dia) {
        super(mes, valor);
        Dia = dia;
    }
    
    public int GetDia() {
        return Dia;
    }
    public void setDia(int dia) {
        Dia = dia;
    }
}

