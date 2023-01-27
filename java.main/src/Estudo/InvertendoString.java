package Estudo;
import java.util.Scanner;

public class InvertendoString {

    public static String reverse(String value) {
        
        String reverse = "";

        for(int i = (value.length() -1); i>= 0; i--) {
            reverse = reverse + value.charAt(i);
        } 

        return reverse;
    }
    public static void main(String[] args) {
        String teste = "ABCEFGHIJKLMNOPQRSTUVWXZ";
        System.out.println(reverse(teste));

    }

} 