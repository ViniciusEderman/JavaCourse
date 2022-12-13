package ProjetoFaculdadePOO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class senhaProfessor extends Polo {
    private int password;
    Scanner entrada = new Scanner(System.in);
    
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void senha() {

            try {
                System.out.println("DIGITE SUA SENHA: ");
                int senha = entrada.nextInt();
                if(senha == 123){
                    setPassword(senha);
                }
            } catch(InputMismatchException InputMismatchException) {
                System.out.println("ERRO! SENHA INCORRETA!");
            }  finally {
                System.out.println("carregando... ");
            }
    }

}
