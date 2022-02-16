package javacursocode;
import java.util.Scanner;

 public class MediaNota {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, nota5, media;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a 1 nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite a 2 nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("Digite a 3 nota: ");
        nota3 = teclado.nextDouble();

        System.out.print("Digite a 4 nota: ");
        nota4 = teclado.nextDouble();

        System.out.print("Digite a 5 nota: ");
        nota5 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
         System.out.println("Sua média é: "+ media);

    teclado.close();

        // Quero que ele registe as notas apenas sendo >0 e <=10, caso não(não registrar nota na variável) //
    }
 }
