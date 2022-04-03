package estudo;
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinha {
    public static void main(String[] args) {
    Scanner armazenarNum = new Scanner(System.in);
   
 Random geradornum = new Random();
    while(true){
            int random = geradornum.nextInt(5);
            System.out.println("Digite um numero entre 0 a 5: ");
            Integer numero = armazenarNum.nextInt();
            if (numero == random) {
                System.out.println("Você acertou, o número era:" + random);
                break;
            } else {
          System.out.println("Você errou, o número era:" + random);

        }
     
    }
     armazenarNum.close();
    
    }
}