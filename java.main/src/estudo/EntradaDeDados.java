package estudo;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        String nome = objeto.nextLine();
        float nota = objeto.nextFloat();
        System.out.format("O nome e a nota é:", nome, nota);
        objeto.close();
}

}
