package Estudo;
import java.util.Scanner;

public class CalculoDelta {
    public static void main (String[] args){
    Scanner objeto = new Scanner(System.in);
    System.out.println("Escolha o valor de A :");
    float a = objeto.nextFloat();
    System.out.println("Escolha o valor de B :");
    float b =  objeto.nextFloat();
    System.out.println("Escolha o valor de C :");
    float c = objeto.nextFloat();
    double delta = (b * b) -4 *(a*c);
    System.out.println(delta);


    objeto.close();
    
    }    
}
// variavel delta = (b.b) - 4.(a.c) //