package Monitoria.DioExercise;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DIOQuestionTwo {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println(scan); // apenas para não dizer que o scan não está utilizável
      int numTotal = scan.nextInt();
      int numFigCompradas = scan.nextInt();
      Set<Integer> setFig = new HashSet<>();
      
      
      for (int i = 1; i <= numFigCompradas; i++) {
        setFig.add(scan.nextInt());
      }
      System.out.println(numTotal - setFig.size());
    }
  }
  