package Monitoria;
import java.util.Scanner;

public class MonitoriaEx1 {
    public static void main(String [] args) {
        float A, B, C;
        Scanner entradaDados = new Scanner(System.in);  
        System.out.println("Digite o valor de A: ");
        float variableA = entradaDados.nextFloat();
        A = variableA;

        System.out.println("Digite o valor de B: ");
        float variableB = entradaDados.nextFloat();
        B = variableB;

        System.out.println("Digite o valor de C: ");
        float variableC = entradaDados.nextFloat();
        C = variableC;

            if(A > B &&  (A > C)) {
                System.out.println("O maior valor é: " + A);
            }  
            else if(B > A && (B > C)) {
                System.out.println("O maior é: " + B);
            }else {
                System.out.println("O valor valor é: " + C);
            }
    entradaDados.close();
    }
}
