package Estudo;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[]args) {
        double resto, elev, raizq, raizc, valorab;
        Scanner valor = new Scanner(System.in);
            System.out.println("Digite um valor para obter os seguintes resultados: resto da divisão por (2), valor elevado ao cubo(3), raiz quadrada, raiz cúbica e valor absoluto: ");
            double escolhaNumero = valor.nextDouble();
            resto = escolhaNumero %2;
            elev = Math.pow(escolhaNumero, 3); 
            raizq = Math.sqrt(escolhaNumero);
            raizc = Math.cbrt(escolhaNumero);
            valorab = Math.abs(escolhaNumero);
            System.out.println("resto: " + resto + " expoente: " + elev + " raiz quadrada: " + raizq + " raiz cúbica: " + raizc + " valor absoluto: " + valorab);
        valor.close();
    }
}
