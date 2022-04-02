package Estudo;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = objeto.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = objeto.nextFloat();
        System.out.format("A nota de %s é de %.2f \n", nome, nota);
        objeto.close();
}

}
