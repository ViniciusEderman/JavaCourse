package ProjetoFaculdadePOO;

import java.util.Scanner;

public class PautaEletronica extends senhaProfessor implements entrada, funcionario, estudante {
    Scanner entrada = new Scanner(System.in);
    Aluno aluno = new Aluno();

    private int op;

    // metodo para entrada
    public void entrar() {
            
        System.out.println("=====================================");
    do{ 
        System.out.println("     SEJA BEM VINDO!!                ");
        System.out.println("=====================================");
        System.out.println("       VOCÊ É:                       ");
        System.out.println("    | 1 - PROFESSOR                 |");
        System.out.println("    | 2 - ALUNO                     |");
        System.out.println("    | 0 - SAIR                      |");
        System.out.println("=====================================");
        System.out.print("   Digite a opção desejada: ");
        op = entrada.nextInt();
        InteracaoEntrar();
    } while(op != 0);
    
    System.out.println("Saindo do sistema....");
}
    
// metodo para professor/funcionario
    public void MenuP() {
            
            System.out.println("=====================================");
        do{ 
            System.out.println("     SISTEMA PARA CONTROLE DE NOTAS");

            System.out.println("=====================================");
            System.out.println("SEJA BEM VINDO " + aluno.nome());
            System.out.println("POLO: " + local());
            System.out.println("    | 1 - INSERIR ALUNO             |");
            System.out.println("    | 2 - PESQUISAR ALUNO           |");
            System.out.println("    | 3 - INSERIR NOTAS             |");
            System.out.println("    | 4 - EXCLUIR ALUNO             |");
            System.out.println("    | 5 - RELATORIO ALUNOS          |");
            System.out.println("    | 6 - INFORMACOES DISCIPLINA    |");
            System.out.println("    | 7 - VOLTAR                    |");
            System.out.println("    | 0 - SAIR                      |");
            System.out.println("=====================================");
            System.out.print("   Digite a opção desejada: ");
            op = entrada.nextInt();
            InteracaoFucionario();
        } while(op != 0);
    }

    // metodo para entrada estudante
    public void MenuA() {
            
            System.out.println("=====================================");
     do{ 
            System.out.println("    SEJA BEM VINDO A AREA DO ALUNO!! ");

            System.out.println("=====================================");
            System.out.println("    | 1 - PESQUISAR ALUNO           |");
            System.out.println("    | 2 - RELATORIO ALUNOS          |");
            System.out.println("    | 3 - INFORMACOES DISCIPLINA    |");
            System.out.println("    | 4 - VOLTAR                    |");
            System.out.println("    | 0 - SAIR                      |");
            System.out.println("=====================================");
            System.out.print("   Digite a opção desejada: ");
            op = entrada.nextInt();
            InteracaoAluno();
        } while(op != 0);
    }

    //metodo para interação do objeto entrada
    public void InteracaoEntrar(){
        System.out.println("=====================================");
        if (op == 1){
                senha();
                if(op == 123){
                    MenuP();
                }
        } 
        else if(op == 2){
                MenuA();
        }
        System.out.println("=====================================");
    }

    //metodo para interação do objeto Funcionario
    public void InteracaoFucionario(){
        System.out.println("=====================================");
        if (op == 1){
            aluno.setInserirAluno();
        } 
        else if(op == 2){
            aluno.buscarAluno();
        }
        else if(op == 3){
            aluno.setInserirNota();
            aluno.verificarNota();
        }
        else if(op == 4){
            aluno.remover();
        }
        else if(op == 5){
            aluno.Resumo();
        }
        else if(op == 6){
            aluno.ResumoGeral();
        } else if(op == 7) {
            entrar();
        }
        System.out.println("=====================================");
    }

    //metodo para interação do objeto Aluno
    public void InteracaoAluno() {
        System.out.println("=====================================");
        if (op == 1){
            aluno.buscarAluno();
        } 
        else if(op == 2){
            aluno.Resumo();
        }
        else if(op == 3){
            aluno.ResumoGeral();
        }
        else if(op == 4) {
            entrar();
        }
        System.out.println("=====================================");
    }
}
