package segbimestre.exerciciosobrecontabancaria;

/**
 *
 * @author Alan H
 */
public class ContaEspecial extends ContaBancaria{
    private float limite;
    
    public ContaEspecial () {
    }
    
    public ContaEspecial (String aCliente, int aNum_conta, float aSaldo, float aLimite) {
        super (aCliente, aNum_conta, aSaldo);
        this.limite = aLimite;
    }
    
    @Override
    public void sacar (float aValorSaque) {
        if ((this.getSaldo()+this.limite) < aValorSaque) {
            System.out.println("- Valor do Saque indisponível");
        } else {
            float saldoLocal = getSaldo() - aValorSaque;
            this.setSaldo(saldoLocal);
            
            System.out.println("- Saque efetuado com Sucesso\nNovo Saldo: " + this.getSaldo());
        }
    }
    
    // All Getters and Setters
    @Override
    public String toString () {
        return "Conta Bancaria{\n- Cliente: " + this.getCliente() + "\n- Numero da Conta: " + this.num_conta + "\n- Saldo: R$ " + this.getSaldo() + "\n- Limite: R$ " + this.limite + "\n}";
    }
}
