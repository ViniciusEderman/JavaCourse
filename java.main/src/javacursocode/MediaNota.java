package javacursocode;
import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha 5 números para armazenar no seu vetor e verificar as posições.");
        System.out.println("Digite a 1 nota: ");
        Integer armazenarP = teclado.nextInt();
        System.out.println("Digite a 2 nota: ");
        Integer armazenarS = teclado.nextInt();
        System.out.println("Digite a 3 nota: ");
        Integer armazenarT = teclado.nextInt();
        System.out.println("Digite a 4 nota: ");
        Integer armazenarFt = teclado.nextInt();
        System.out.println("Digite a 5 nota: ");
        Integer armazenarFi = teclado.nextInt();
        
        int media = armazenarP + armazenarS + armazenarT + armazenarFt + armazenarFi;
        int mediaFinal = media/5;

            if (armazenarP<0 || armazenarP>10 ) {
                System.out.println("Nota não permitida");           
            } else {
                System.out.println("Nota registrada");  
            } 
            if (armazenarS<0 || armazenarS>10 ) {
                System.out.println("Nota não permitida");
            } else {
                System.out.println("Nota registrada");  
            } 
            if (armazenarT<0 || armazenarT>10 ) {
                System.out.println("Nota não permitida");
            } else {
                System.out.println("Nota registrada");  
            } 
            if (armazenarFt<0 || armazenarFt>10 ) {
                System.out.println("Nota não permitida");
            } else {
                System.out.println("Nota registrada");  
            } 
            if (armazenarFi<0 || armazenarFi>10 ) {
                System.out.println("Nota não permitida");
            } else {
                System.out.println("Nota registrada");  
            } 
            while (true) {
                if (mediaFinal<0 || mediaFinal>10) {
                    System.out.println("Sua média não será impressa");
            }   else {
                    System.out.println("Sua média é: " + mediaFinal);
            break;
                }   
            }
        teclado.close();
    }
}
