package ProjetoFaculdadePOO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class senhaProfessor extends Polo {
    Scanner entrada = new Scanner(System.in);
    private int password;
    
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void senha() {

        for(int i = 0; i < 3; i++) {
            try {
                System.out.println("DIGITE SUA SENHA: ");
                password = entrada.nextInt();
                setPassword(password);
            } catch(InputMismatchException InputMismatchException) {
                System.out.println("ERRO! SENHA INCORRETA!");
            }   
        } 
    }
}
