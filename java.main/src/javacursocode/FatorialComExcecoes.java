package javacursocode;
import java.util.Scanner;

public class FatorialComExcecoes {
    public static void main(String[]args) {
        int fat;
        Scanner objeto = new Scanner(System.in);
        System.out.println("Digite um número para o resultado do fatorial. Obs:diferente de 0. Digite aqui: ");
        Integer leitura = objeto.nextInt();
        fat = 1;
        objeto.close(); 

        if (leitura<=0) {
            System.out.println("Programa encerrado");
            System.out.print("Encerando...30");
            return;           
        }
        while(leitura>0) {
            fat = fat * leitura;
            leitura--;     
        }
        System.out.print("O fatorial é :"  +fat);  
    }
}
// ALGUNS PROBLEMAS COM NÚMEROS ESPECÍFICOS(BUSCAR AJUDA). // 
