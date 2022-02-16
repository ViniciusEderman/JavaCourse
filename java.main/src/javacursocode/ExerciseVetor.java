package javacursocode;
import java.util.Scanner;

public class ExerciseVetor {

    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);
        System.out.println("Escolha 5 números para armazenar no seu vetor e verificar as posições. Digite aqui: ");
        Integer armazenarEscolha = entradaDeDados.nextInt();
       
        int vetor[] = new int[5];
        
        for (int c=0; c<vetor.length; c++) {
            if (c==1 && c==2 && c==3 && c==4 && c==5) {
                System.out.println("Digite novamente: ");
            } else {
                System.out.println("Operação não permitida " + armazenarEscolha);
            }
        }    
            for(int i = 0; i<vetor.length; i++) {
                System.out.println(i);
            }

        entradaDeDados.close();
    }
}
