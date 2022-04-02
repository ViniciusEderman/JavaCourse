package estudo;
import java.util.Scanner;

public class IdadeNascimento {
 public static void main(String[] args) {
    Scanner objeto = new Scanner(System.in);
    System.out.println("Digite o ano do seu nascimento: ");
    Integer idadeUser = objeto.nextInt();
    int anoAtual = 2022;
    int idadeFinal = anoAtual - idadeUser;
    System.out.printf("A sua idade em 2022 é %d \n: ", idadeFinal);
    objeto.close();
    }   
      
  }