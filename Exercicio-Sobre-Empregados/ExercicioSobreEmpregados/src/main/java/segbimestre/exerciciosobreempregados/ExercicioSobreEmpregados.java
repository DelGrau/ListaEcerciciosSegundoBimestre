package segbimestre.exerciciosobreempregados;

/**
 *
 * @author Alan H
 */
public class ExercicioSobreEmpregados {

    public static void main(String[] args) {
        Empregado empregado = new Empregado ("Alan", 1800.00f);
        System.out.println(empregado.toString()+"\n");
        
        Gerente gerente = new Gerente ("Alan Henrique", 3000.00f, "Vendas");
        System.out.println(gerente.toString()+"\n   ");
        
        Vendedor vendedor = new Vendedor ("Alan Ribeiro", 1800.00f, 3.00f);
        System.out.println(vendedor.toString());
    }
}
