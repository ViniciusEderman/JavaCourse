package ProjetoFaculdadePOO;

import java.util.Scanner;
public class PautaEletronica {
    Scanner entrada = new Scanner(System.in);
    Aluno aluno = new Aluno();

    private int op;

    public void Menu() {
            
        do{ 
            System.out.println("     SISTEMA PARA CONTROLE DE NOTAS");

            System.out.println("=====================================");
            System.out.println("    | 1 - INSERIR ALUNO             |");
            System.out.println("    | 2 - PESQUISAR ALUNO           |");
            System.out.println("    | 3 - INSERIR NOTAS             |");
            System.out.println("    | 4 - EXCLUIR ALUNO             |");
            System.out.println("    | 5 - RELATORIO ALUNOS          |");
            System.out.println("    | 6 - INFORMACOES DISCIPLINA    |");
            System.out.println("    | 0 - SAIR                      |");
            System.out.println("=====================================");
            System.out.print("   Digite a opção desejada: ");
            op = entrada.nextInt();
            Interacao();
        } while(op != 0);
        
    System.out.println("Saindo do sistema....");
    }

    public void Interacao(){
        
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
        }
        System.out.println("=====================================");


    }
}
