package ProjetoFaculdadePOO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class senhaProfessor extends Polo {
    private String password;
    Scanner entrada = new Scanner(System.in);
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void senha() {

            try {
                System.out.println("DIGITE SUA SENHA: ");
                password = entrada.next();
                acesso();
            } catch(InputMismatchException InputMismatchException) {
                System.out.println("ERRO! SENHA INCORRETA!");
            }  finally {
                System.out.println("carregando... ");
            }
    }

    public void acesso(){
        if(password.equals("123")) {
            setPassword(password);
        } else {
            System.out.println("Senha incorreta");
        }
    }
}
