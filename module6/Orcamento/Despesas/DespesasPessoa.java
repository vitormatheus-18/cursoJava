public class DespesasPessoa {
    private String Cpf;
    private DespesasMes DespesasPessoa[];
    
    
    public DespesasPessoa(String cpf, DespesasMes[] despesasPessoa) {
        Cpf = cpf;
        DespesasPessoa = despesasPessoa;
    }

    public String GetCpf() {
        return Cpf;
    }

    public DespesasMes TotalMes(int Mes) {

        float totalDespesas = 0;
        for(int i = 0; i <= DespesasPessoa.length; i++) {
            if (DespesasPessoa[i].getMes() == Mes) {
                totalDespesas += DespesasPessoa[i].getValor();
            }
        }
        return new DespesasMes(Mes, totalDespesas);
    }
}