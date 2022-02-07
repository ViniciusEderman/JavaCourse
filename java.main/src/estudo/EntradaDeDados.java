package estudo;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        String nome = objeto.nextLine();
        float nota = objeto.nextFloat();
        System.out.format("A nota de %s é de %.1f \n", nome, nota);
        objeto.close();
}

}
