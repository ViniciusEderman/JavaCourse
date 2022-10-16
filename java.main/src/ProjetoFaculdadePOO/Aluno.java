package ProjetoFaculdadePOO;
import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    //variables:
    private String nome, situacao, disciplina;
    private float nota1, nota2, nota3, media;
    ArrayList aluno = new ArrayList<>();
    
    //construtor:
    public Aluno(float nota1, float nota2) {
        // situacao == aprovado, reprovado e de recuperacao
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.disciplina = "Matemática";
    }

    // sobrecarga do construtor aluno
    public Aluno(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.disciplina = "Matemática";
    }

    
    //metódo para inserir alunos no array
    public void setInserirAluno() {

        Scanner entrada = new Scanner(System.in);
        

        //insere alunos
        for(int i = 0; i < 3; i++) {
            
            System.out.println("Digite o nome do aluno: ");
            this.nome = entrada.nextLine();
            aluno.add(nome);
        }
        
        //printa o aluno
        System.out.println(aluno);
        entrada.close();
    }


    //metodo responsável por apresentar o Aluno
    public void apresentarAluno() {
        
       System.out.println("O aluno: " + aluno.get(0) + " participante da disciplina: " + this.disciplina + "o aluno está atualmente: " + this.situacao);
    }

    //metodo de verificarNota
    public void verificarNota() {

        //Bloco de verificacao de quais notas entrarao na media
        if(this.nota1 >= this.nota2 && this.nota2 > this.nota3 || this.nota2 > this.nota1) {
            media = (this.nota1 + this.nota2)/2;
        }
        else if(this.nota2 > this.nota1 && this.nota3 > this.nota1) {
            media = (this.nota2 + this.nota3)/2;
        }
        else if(this.nota1 > this.nota2 && this.nota3 > this.nota2) {
            media = (this.nota1 + this.nota3)/2;
        }

        //bloco de verificacao de media:
        if(media >= 6) {
            situacao = "aprovado";
           // System.out.println(situacao);
        }
        else if(media >= 4 && nota3 == 0) {
            situacao = "recuperação";
           // System.out.println(situacao);
        }
        else if(media < 6) {
            situacao = "reprovado";
          //  System.out.println(situacao);
        }
    }
}
