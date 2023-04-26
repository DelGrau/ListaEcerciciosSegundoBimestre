package segbimestre.exerciciosobreingressos;

/**
 *
 * @author Alan H
 */
public class IngressoVIP extends Ingresso{
    private float valorAdicional;
    
    public IngressoVIP () {
    }
    
    public IngressoVIP (float aValor, float aValorAdicional) {
        super (aValor);
        this.valorAdicional = aValorAdicional;  
    }
    
    // All Getters and Setters
    @Override
    public String toString() {
        return "IngressoVIP{" + "Valor: R$ " + (this.getValor()+valorAdicional) + '}';
    }
    
}
