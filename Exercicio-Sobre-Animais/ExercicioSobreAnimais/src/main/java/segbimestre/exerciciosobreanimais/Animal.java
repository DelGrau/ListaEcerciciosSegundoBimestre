package segbimestre.exerciciosobreanimais;

/**
 *
 * @author Alan H
 */
public class Animal {
    protected String nome;
    protected String cor;
    protected String ambiente;
    protected int comprimento;
    protected float velocidade;
    protected int patas;
    
    public Animal () {
    }
   
    public Animal (String aNome, String aCor, String aAmbiente, int aComprimento, float aVelocidade, int aPatas) {
        this.nome = aNome;
        this.cor = aCor;
        this.ambiente = aAmbiente;
        this.comprimento = aComprimento;
        this.velocidade = aVelocidade;
        this.patas = aPatas;
    }
    
    public void alteraNome(String aNome) {
        this.nome = aNome;
    }
    
    public void alteraComprimento(int aComprimento) {
        this.comprimento = aComprimento;
    }
    
    public void alteraPatas(int aPatas) {
        this.patas = aPatas;
    }
    
    public void alteraCor(String aCor) {
        this.cor = aCor;
    }
    
    public void alteraAmbiente(String aAmbiente) {
        this.ambiente = aAmbiente;
    }
    
    public  void alteraVelocidade(float aVelocidade) {
        this.velocidade = aVelocidade;
    }
    
    public void dados () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Patas: " + this.patas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade: " + this.velocidade);
        
    }
}
