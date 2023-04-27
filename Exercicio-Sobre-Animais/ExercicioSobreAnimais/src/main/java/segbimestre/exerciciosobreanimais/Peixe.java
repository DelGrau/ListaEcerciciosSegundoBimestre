package segbimestre.exerciciosobreanimais;

/**
 *
 * @author Alan H
 */
public class Peixe extends Animal{
    protected String caracteristica;
    
    public Peixe () {
    }
    
    public Peixe (String aNome, String aCor, String aAmbiente, int aComprimento, float aVelocidade, int aPatas, String aCaracteristica) {
        super (aNome, aCor, aAmbiente, aComprimento, aVelocidade, aPatas);
        this.caracteristica = aCaracteristica;
    }
    
    public void alteraCaracteristica (String aCaracteristica) {
        this.caracteristica = aCaracteristica;
    }
    
    @Override
    public void dados () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Patas: " + this.patas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Caracteristica: " + this.caracteristica);
    }
}
