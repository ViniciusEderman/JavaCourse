package ProjetoFaculdadePOO;

import java.util.Scanner;

public class Menu extends senhaProfessor implements entrada, funcionario, estudante {
    Scanner entrada = new Scanner(System.in);
    
    //instâncias de objeto
    Aluno aluno = new Aluno();
    professor prof = new professor();
    faculdade polo = new faculdade();
    cursos curso = new cursos();
    disciplina disci = new disciplina();

    String disciplina;
    private int op;
    private boolean loop = true;

    // metodo para adicionar o local da faculdade
    public void localFaculdade(){
            System.out.println("=====================================");
        do{ 
            System.out.println("     SEJA BEM VINDO!!                ");
            System.out.println("=====================================");
            polo.local();
            acessarEntrar();
        } while(loop);
    }

    public void acessarEntrar() {
        if(polo.local.equalsIgnoreCase("Sair")){
            loop = false;
            System.out.println("Saindo do sistema....");
        } else {
            loop = true;
            entrar();
        }
    }

    public void cancelarLoop() {
        if(op == 0){
            loop = false;
            System.out.println("Saindo do sistema....");
        }
    }
    // metodo para entrada
    public void entrar() {
        System.out.println("=====================================");
    do{ 
        System.out.println("     VOCÊ É:                         ");
        System.out.println("=====================================");
        System.out.println("    | 1 - FUNCIONARIO               |");
        System.out.println("    | 2 - ALUNO                     |");
        System.out.println("    | 0 - SAIR                      |");
        System.out.println("=====================================");
        System.out.print("   Digite a opção desejada: ");
        op = entrada.nextInt();
        cancelarLoop();
        InteracaoEntrar();
    } while(op != 0);
    }
    
// metodo para professor/funcionario
    public void MenuP() {
            System.out.println("=====================================");
        do{ 
            System.out.println("     SISTEMA PARA CONTROLE DE NOTAS");

            System.out.println("=====================================");
            System.out.println("SEJA BEM VINDO " + prof.nome.toUpperCase().strip());
            System.out.println("POLO: " + polo.local.toUpperCase().strip());
            System.out.println("Você é: " + cargo.toUpperCase().strip());
            System.out.println("Da diciplina: " + aluno.disciplina.toUpperCase().strip());
            System.out.println("Do turno: " + prof.turno());
            System.out.println("    | 1 - INSERIR ALUNO             |");
            System.out.println("    | 2 - PESQUISAR ALUNO           |");
            System.out.println("    | 3 - INSERIR NOTAS             |");
            System.out.println("    | 4 - ATUALIZAR NOTAS           |");
            System.out.println("    | 5 - EXCLUIR ALUNO             |");
            System.out.println("    | 6 - RELATORIO ALUNOS          |");
            System.out.println("    | 7 - INFORMACOES DISCIPLINA    |");
            System.out.println("    | 8 - VOLTAR                    |");
            System.out.println("    | 0 - SAIR                      |");
            System.out.println("=====================================");
            System.out.print("   Digite a opção desejada: ");
            op = entrada.nextInt();
            cancelarLoop();
            InteracaoFucionario();
        } while(op != 0);
    }

    // metodo para entrada estudante
    public void MenuA() {
            System.out.println("=====================================");
     do{ 
            System.out.println("    SEJA BEM VINDO A AREA DO ALUNO!! ");

            System.out.println("=====================================");
            System.out.println("Seu curso é: " + curso.curso);
            System.out.println("    | 1 - PESQUISAR ALUNO           |");
            System.out.println("    | 2 - RELATORIO ALUNOS          |");
            System.out.println("    | 3 - INFORMACOES DISCIPLINA    |");
            System.out.println("    | 4 - VOLTAR                    |");
            System.out.println("    | 0 - SAIR                      |");
            System.out.println("=====================================");
            System.out.print("   Digite a opção desejada: ");
            op = entrada.nextInt();
            cancelarLoop();
            InteracaoAluno();
        } while(op != 0);
    }

    //metodo para interação do objeto entrada
    public void InteracaoEntrar(){
        System.out.println("=====================================");
        if (op == 1){
                prof.nomeProfessor();
                senha();
                if(getPassword().equals("123")){
                    cargo();
                    disci.adicionarDisciplina();
                    aluno.disciplina = disci.disciplina;
                    MenuP();
                }
            } 
            else if(op == 2){
                curso.nomeDoCurso();
                aluno.adicionarDisciplina();
                MenuA();
        }
        else if(op != 0){
            System.out.println("=====================================");
        }
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
        else if(op == 4) {
            aluno.atualizarDados();
        }
        else if(op == 5){
            aluno.remover();
        }
        else if(op == 6){
            aluno.Resumo();
        }
        else if(op == 7){
            aluno.ResumoGeral();
        } 
        else if(op == 8) {
            entrar();
        } else if(op != 0){
            System.out.println("=====================================");
        }
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
        else if(op != 0){
            System.out.println("=====================================");
        }
    }

}
