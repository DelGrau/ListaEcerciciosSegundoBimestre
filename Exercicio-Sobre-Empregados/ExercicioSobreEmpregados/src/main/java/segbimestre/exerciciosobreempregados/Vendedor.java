package segbimestre.exerciciosobreempregados;

/**
 *
 * @author Alan H
 */
public class Vendedor extends Empregado{
    private float percentualComissao;
    
    public Vendedor () {
    }
    
    public Vendedor (String aNome, float aSalario, float aPercentualComissao) {
        super (aNome, aSalario);
        this.percentualComissao = aPercentualComissao;
    }
    
    //All Getters and Setters
    public float getPercentualComissao () {
        return this.percentualComissao;
    }
    
    @Override
    public String toString () {
        return "Vendedor { Nome: " + this.getNome() + "\nSalario: " + this.getSalario() + "\nPercentual Comissão: " + this.percentualComissao + "% }";
    }
}
