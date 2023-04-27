package segbimestre.exerciciosobrecontabancaria;

/**
 *
 * @author Alan H
 */
public class ContaPoupanca extends ContaBancaria{
    public int dia_rendimento;
    
    public ContaPoupanca () {
    }
    
    public ContaPoupanca (String aCliente, int aNum_conta, float aSaldo, int aDia_rendimento) {
        super (aCliente, aNum_conta, aSaldo);
        this.dia_rendimento = aDia_rendimento;
    }
    
    public void calcularNovoSaldo (float aRendimento) {
        aRendimento *= this.getSaldo();
        this.setSaldoRend(aRendimento);
    }
    
    // All Getters and Setters
    @Override
    public String toString () {
        return "Conta Bancaria{\n- Cliente: " + this.getCliente() + "\n- Numero da Conta: " + this.num_conta + "\n- Saldo: R$ " + this.getSaldo() + "\n- Dia do Rendimento: " + this.dia_rendimento + "\n}";
    }
}
