package Estudo;
import java.util.Scanner;

public class VerificarNota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        Integer nota1 = entrada.nextInt();
        
        int media = 0;
        
        System.out.println("Digite a segunda nota: ");
        Integer nota2 = entrada.nextInt();

        while(nota1 < 0 || nota1 > 10 && nota2 < 0 || nota2 > 10) {
            System.out.println("Você errou. Digite a primeira nota: ");
            nota1 = entrada.nextInt();

            System.out.println("Você errou. Digite a segunda nota: ");
            nota2 = entrada.nextInt();
        }
        if(nota1 >= 0 && nota1 <= 10) {
            media = (nota1 + nota2) / 2;
            System.out.println("A sua média é de: " + media);
        }
        entrada.close();
    }
}
