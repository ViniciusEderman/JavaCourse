package Estudo;
import java.util.Scanner;

public class ExerciseClass24 {
   public static void main (String[] args){
   Scanner objeto = new Scanner(System.in);
   float x, soma;
   soma = 0;
   float par = -1;
   float impar = 0;
   float total = 0;
   float acimaDeCem = 0;
   float media = 0;

    do {
        System.out.println("Digite o número (0 encerra o programa): ");
        Integer quantd = objeto.nextInt();
        x = quantd;
        soma += x;
        total++;

        if (x%2==0){
            par++; 
         } else {
             impar++;
         }
         if (x>=100){
             acimaDeCem++;
        }
    } while(x != 0);
        media = soma/total;
        System.out.println("Resultado: " + "Total de valores: "+ total 
            + "Total de pares: "+ par + "Total de ímpares: "+ impar + "Acima de 100: "+ acimaDeCem +
                "Soma dos valores: " + soma + "Média dos valores: " + media);
    objeto.close();
   } 
}
