package segbimestre.exerciciosobreempregados;

/**
 *
 * @author Alan H
 */
public class Gerente extends Empregado{
    private String departamento;
    
    public Gerente () {
    }
    
    public Gerente (String aNome, float aSalario, String aDepartamento) {
        super (aNome, aSalario);
        this.departamento = aDepartamento;
    }
    
    // All Getters e Setters
    public String getDepartamento () {
        return this.departamento;
    }
    
    @Override
    public String toString () {
        return "Gerente{ Nome: " + this.getNome() + "\nSalario: " + this.getSalario() + "\nDepartamento: " + this.departamento + " }";
    }
}
