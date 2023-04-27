package segbimestre.exerciciosobrecontabancaria;

/**
 *
 * @author Alan H
 */
public class ContaBancaria {
    protected String cliente;
    public int num_conta;
    private float saldo;
    
    public ContaBancaria () {
    }
    
    public ContaBancaria (String aCliente, int aNum_conta, float aSaldo) {
        this.cliente = aCliente;
        this.num_conta = aNum_conta;
        this.saldo = aSaldo;
    }
    
    public void sacar (float valorSaque) {
        if (this.saldo<valorSaque) {
            System.out.println("- Valor do Saque indisponível");
        } else {
            this.saldo -= valorSaque;
            System.out.println("- Saque efetuado com Sucesso\nNovo Saldo: " + this.saldo);
        }
    }
    
    public void depositar (float valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("- Deposito efetuado com Sucesso\nNovo Saldo: " + this.saldo);
    }
    
    // All Getters and Setters
    public String getCliente () {
        return this.cliente;
    }
    
    public float getSaldo () {
        return this.saldo;
    }
    
    public void setSaldoRend (float aRendimento) {
        this.saldo += aRendimento;
    }
    
    public void setSaldo (float aNewSaldo) {
        this.saldo = aNewSaldo;
    }
    
    @Override
    public String toString () {
        return "Conta Bancaria{\n- Cliente: " + this.cliente + "\n- Numero da Conta: " + this.num_conta + "\n- Saldo: R$ " + this.saldo + "\n}";
    }
}
