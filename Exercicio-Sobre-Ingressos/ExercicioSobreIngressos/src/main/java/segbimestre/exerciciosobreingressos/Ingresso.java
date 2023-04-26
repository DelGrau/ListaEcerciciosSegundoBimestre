package segbimestre.exerciciosobreingressos;

/**
 *
 * @author Alan H
 */
public class Ingresso {
    private float valor;
    
    public Ingresso () {
    }
    
    public Ingresso (float aValor) {
        this.valor = aValor;
    }
    
    // All Getters and Setters
    @Override
    public String toString() {
        return "Ingresso{" + "Valor: R$ " + valor + '}';
    }
    
    public float getValor () {
        return this.valor;
    }
    
}
