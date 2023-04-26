package segbimestre.exerciciosobreempregados;

/**
 *
 * @author Alan H
 */
public class Empregado {
    private String nome;
    protected float salario;
    
    public Empregado () {
    }
    
    public Empregado (String aNome, float aSalario) {
        this.nome = aNome;
        this.salario = aSalario;
    }
    
    // All Getters and Setters
    public String getNome() {
        return this.nome;
    }
    
    public float getSalario () {
        return this.salario;
    }
    
    @Override
    public String toString () {
        return "Empregado{ Nome: " + this.nome + "\nSalario: " + this.salario + " }";
    }
}
