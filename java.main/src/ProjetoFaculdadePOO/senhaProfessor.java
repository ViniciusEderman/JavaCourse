package ProjetoFaculdadePOO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class senhaProfessor extends pessoa {
    private int password;
    Scanner entrada = new Scanner(System.in);
    
    public int getPassword() { 
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String cargo() {
        System.out.println("Digite seu cargo: ");
        return cargo = entrada.next();
    }

    public void senha() {
        for(int i = 0; i < 3; i++) {
            try {
                System.out.println("DIGITE SUA SENHA: ");
                password = entrada.nextInt();
                acesso();
            } catch(InputMismatchException InputMismatchException) {
                System.out.println("ERRO! SENHA INCORRETA!");
                
                if(i == 1) {
                    System.out.println("TENTE APENAS NÚMEROS DE UMA CERTA SEQUÊNCIA!!! EX: 456");
                }
                
                entrada.nextLine();
            }  finally {
                System.out.println("carregando... ");
            }
        }
       
    }

    public void acesso(){
        if(password == 123) {
            setPassword(password);
        } else {
            System.out.println("Senha incorreta");
        }
    }
}
