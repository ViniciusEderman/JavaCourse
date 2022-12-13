package ProjetoFaculdadePOO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class senhaProfessor extends Polo {
    public int password;
    
    public void senha() {
        Boolean loop = true;
        Scanner dig = new Scanner(System.in);

        do{
            try {
                System.out.println("DIGITE SUA SENHA: ");
                password = dig.nextInt();
                loop = false;
            } catch(InputMismatchException InputMismatchException) {
                System.out.println("ERRO! SENHA INCORRETA!");
            }   
        } while(loop);
        dig.close();
    }
}
