package ProjetoFaculdadePOO;
import java.util.Scanner;

class Aluno {
    //variables:
    private String nome, situacao, disciplina;
    private float nota1, nota2, nota3, media;
    
    //construtor:
    public Aluno(String nome, float nota1, float nota2, float nota3, String situacao) {
        // situacao == aprovado, reprovado e de recuperacao
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.situacao = situacao;
    }

    // sobrecarga do construtor aluno
    public Aluno(String disciplina) {

        this.disciplina = disciplina;
    }

    //metodo responsável por apresentar o Aluno
    public void apresentarAluno() {
        System.out.println("O aluno: " + this.nome + " participante da disciplina: " + this.disciplina);
    }

    //metódo para inserir alunos no array
    public void setInserirAluno() {

        Scanner entrada = new Scanner(System.in);

        String arrayAluno[] = new String[3];

        //insere alunos
        for(int i = 0; i < 3; i++) {

            System.out.println("Digite o nome do aluno: ");
            arrayAluno[i] = entrada.nextLine();
        }

        //printa o aluno
        for(int i = 0; i < 3; i++) {
            System.out.println(arrayAluno[i]);
        }
        entrada.close();
    }
    
    //metodo de verificarNota
    public void verificarNota() {

        //Bloco de verificacao de quais notas entrarao na media
        if(this.nota1 >= this.nota2 && this.nota2 > this.nota3 || this.nota2 > this.nota1) {
            media = (this.nota1 + this.nota2)/2;
        }
        if(this.nota2 > this.nota1 && this.nota3 > this.nota1) {
            media = (this.nota2 + this.nota3)/2;
        }
        if(this.nota1 > this.nota2 && this.nota3 > this.nota2) {
            media = (this.nota1 + this.nota3)/2;
        }

        //bloco de verificacao de media:
        if(media >= 6) {
            this.situacao = "aprovado";
            System.out.println(situacao);
        }
        if(media >= 4 && nota3 == 0) {
            this.situacao = "recuperação";
            System.out.println(situacao);
        }
        if(media < 6) {
            this.situacao = "reprovado";
            System.out.println(situacao);
        }
    }
}
