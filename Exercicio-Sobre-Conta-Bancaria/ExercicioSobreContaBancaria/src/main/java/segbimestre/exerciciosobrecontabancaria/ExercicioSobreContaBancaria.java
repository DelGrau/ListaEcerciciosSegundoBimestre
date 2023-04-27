package segbimestre.exerciciosobrecontabancaria;

/**
 *
 * @author Alan H
 */
public class ExercicioSobreContaBancaria {

    public static void main(String[] args) {
        // Criação das Contas
        ContaBancaria contaBancaria = new ContaBancaria ("Alan", 1234555, 1000.00f);
        System.out.println(contaBancaria.toString());
        
        ContaPoupanca contaPoupanca = new ContaPoupanca ("Alan Henrique", 128755, 15000.00f, 6);
        System.out.println(contaPoupanca.toString());
        
        ContaEspecial contaEspecial = new ContaEspecial ("Alan Ribeiro", 769913, 500.00f, 5000.00f);
        System.out.println(contaEspecial.toString());
        
        // Sacando
        contaBancaria.sacar(1500.00f);
        contaBancaria.sacar(700.00f);
        
        contaPoupanca.sacar(20000.00f);
        contaPoupanca.sacar(1000.00f);
        
        contaEspecial.sacar(10000.00f);
        contaEspecial.sacar(2000.00f);
        
        // Depositando 
        contaBancaria.depositar(5000.00f);
        
        contaPoupanca.depositar(1500.00f);
        
        contaEspecial.depositar(10000.00f);
        
        // Novo valor pelo Rendimento
        contaPoupanca.calcularNovoSaldo(0.025f);
        
        // Novos dados das Contas
        System.out.println(contaBancaria.toString());
        
        System.out.println(contaPoupanca.toString());
        
        System.out.println(contaEspecial.toString()); 
    }
}
