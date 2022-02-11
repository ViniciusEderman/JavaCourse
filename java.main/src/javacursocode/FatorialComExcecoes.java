package javacursocode;
import java.util.Scanner;

public class FatorialComExcecoes {
    public static void main(String[]args) {
        int fat;
        Scanner objeto = new Scanner(System.in);
        System.out.println("Digite um número para o resultado do fatorial. Obs: diferente de 0. Digite aqui: ");
        Integer leitura = objeto.nextInt();
        fat = 1;
        int resultadoPost;
        objeto.close(); 

            while (leitura<=0) {
                System.out.println("Programa encerrado");
                if (leitura<=0) {
                    System.out.print("Encerando...");
                break;
                }           
            }
            while(leitura>1) {
                fat = fat * leitura;
                leitura--;     
                resultadoPost = fat;        
                System.out.print("O fatorial é :"  +resultadoPost);  
            }            
    }
}
    