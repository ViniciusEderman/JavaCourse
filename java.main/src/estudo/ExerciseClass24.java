package Estudo;
import java.util.Scanner;

public class ExerciseClass24 {
   public static void main (String[] args){
   Scanner objeto = new Scanner(System.in);

   //declaração de var:
   float x, soma, par, impar, total, acimaDeCem, media;
   
   // atribuiçao de valor:
   soma = 0;
   par = -1;
   impar = 0;
   total = 0;
   acimaDeCem = 0;
   media = 0;

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
