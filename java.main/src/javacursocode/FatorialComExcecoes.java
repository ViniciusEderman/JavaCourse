package javacursocode;
import java.util.Scanner;

public class FatorialComExcecoes {
    public static void main(String[]args) {
    int fat;
    Scanner objeto = new Scanner(System.in);
    System.out.println("Digite um número para o resultado do fatorial. Obs: diferente de 0. Digite aqui: ");
    Integer leitura = objeto.nextInt();
    fat = 1;
    while (true) {
        leitura<=0
        System.out.println("Programa Encerrado");
    break;
    do {
        fat = fat * leitura;
        leitura--;
    } while (leitura>1); {
        System.out.print("O fatorial é :"  +fat);
        }
      } 
    objeto.close(); 
    }
}
