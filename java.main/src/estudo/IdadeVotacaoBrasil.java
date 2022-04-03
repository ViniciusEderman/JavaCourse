package estudo;
import java.util.Scanner;

public class IdadeVotacaoBrasil {
    public static void main(String[]args) {
    Scanner idade = new Scanner(System.in);
    System.out.println("Digite a idade para descobrir as opções de votação. Digite aqui:" );
    Integer idadeescolhida = idade.nextInt();

        if ((idadeescolhida >= 0) &&  (idadeescolhida < 16)) {
            System.out.println("Não vota");
        } if ((idadeescolhida >=16 ) && (idadeescolhida <18)) {
            System.out.println("Voto opcional");
        } if ((idadeescolhida >=18) && (idadeescolhida <=70)) {
            System.out.println("Voto obrigatório");
        } if (idadeescolhida > 70) {
            System.out.println("Voto opcional");
        }
idade.close();  
    }
}
// esse código pode ser encurtado, modificando o voto de 70(opcional) e colocando no primeiro if 
