package estudo;
import java.util.Scanner;

public class SomaComRepeticao {
    public static void main (String[] args){
    int soma, x;
    soma = 0;
    String responda = new String();
    Scanner entrada = new Scanner(System.in);
    
    do {
        System.out.println("Digite um número: ");
        x = entrada.nextInt();
        soma += x;
        System.out.println("Deseja continuar? Digite: (S/N) ");
        responda = entrada.next();
    } while (responda.equals("S"));
        System.out.println("A soma de todos os valores é:" + soma);

    entrada.close();    
    }   
}
// FUNCIONANDO 100% // 
