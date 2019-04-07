package questao7;

/**
 * @author Eduardo C.
 */
public class EmpresaDemo {
    public static void main(String[] args) {
        Empresa[] listaEmpresas = new Empresa[5];
        listaEmpresas[0] = new Empresa("Alpha",1000000,63);
        listaEmpresas[1] = new Empresa("Beta",560000,39);
        listaEmpresas[2] = new Empresa("Charlie",30000,12);
        listaEmpresas[3] = new Empresa("Delta",200000,27);
        listaEmpresas[4] = new Empresa("Echo",7000,3);
        
        int menorqtdFuncionarios=0;
        double maiorCapital=0;
        String nomeEmpresaMenorqtdFunc= "";
        String nomeEmpresaMaiorCapital = "";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                nomeEmpresaMenorqtdFunc = listaEmpresas[0].getNome();
                menorqtdFuncionarios = listaEmpresas[0].getnFuncionarios();
                nomeEmpresaMaiorCapital = listaEmpresas[0].getNome();
                maiorCapital = listaEmpresas[0].getCapital();
            }else{
                if (listaEmpresas[i].getnFuncionarios() < menorqtdFuncionarios) {
                    nomeEmpresaMenorqtdFunc = listaEmpresas[i].getNome();
                    menorqtdFuncionarios = listaEmpresas[i].getnFuncionarios();
                }
                if (listaEmpresas[i].getCapital() > maiorCapital) {
                    nomeEmpresaMaiorCapital = listaEmpresas[i].getNome();
                    maiorCapital = listaEmpresas[i].getCapital();
                }
            }
        }
        

        System.out.println("A empresa com menor número de funcionários é "+nomeEmpresaMenorqtdFunc);
        System.out.println("A empresa com maior capital é "+nomeEmpresaMaiorCapital);
    }
}
