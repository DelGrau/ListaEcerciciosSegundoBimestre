package segbimestre.exerciciosobreingressos;

/**
 *
 * @author Alan H   
 */
public class ExercicioSobreIngressos {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(1.99f);
        System.out.println(ingresso.toString());
        
        IngressoVIP ingressoVIP = new IngressoVIP(1.99f, 3.00f);
        System.out.println(ingressoVIP.toString());
    }
}
