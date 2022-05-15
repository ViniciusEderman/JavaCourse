package Monitoria.DioExercise;
import java.util.Scanner;

public class DIOQuestionOne {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println(scan); // apenas para parar de reclamar do scan
      String input = scan.nextLine();  
      
      String[] inputSplit = input.split("");
      double media = Double.parseDouble(inputSplit[0]) / Double.parseDouble(inputSplit[1]);
        // inputSplit[0] == H
        // inputSplit[1] == p

      System.out.printf("%.2f", media);
    }
}
