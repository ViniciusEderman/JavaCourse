package ProjetoFaculdadePOO;
import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    //variables:
    private String nome, situacao, disciplina;
    private float nota1, nota2, nota3, media;
    ArrayList<String> aluno = new ArrayList<>();
    ArrayList<Float> notas = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    
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

        
        //insere alunos
        for(int i = 0; i < 3; i++) {
            
            System.out.println("Digite o nome do aluno: ");
            this.nome = entrada.nextLine();
            aluno.add(nome);
        }
        
        //printa o aluno
        System.out.println(aluno);
       
    }

    public void remover() { 
        
        for(int i = 0; i < aluno.size(); i++){
            System.out.println((i + 1) + " " + aluno.get(i));
        }
        System.out.println("Selecione um número para Remover: ");
        int op = entrada.nextInt();
       
        if(op == 1){
            aluno.remove(op - 1);
            System.out.println("Aluno Removido");
        } 
        else if (op <= aluno.size()){
            aluno.remove(op);
            System.out.println("Aluno Removido");
            }
    	}

    //metodo responsável por apresentar o Aluno
    public void apresentarAluno() {
        
        System.out.println("Digite um comando: 0 para o primeiro aluno, 1 para o segundo aluno e 2 para o terceiro");
        int numeroDigitado = entrada.nextInt();
        
        if(numeroDigitado == 0) {
            System.out.println("O aluno: " + aluno.get(0)+ " participante da disciplina: " + this.disciplina + "o aluno está atualmente: " + this.situacao);
        }
        else if(numeroDigitado == 1) {
            System.out.println("O aluno: " + aluno.get(1)+ " participante da disciplina: " + this.disciplina + "o aluno está atualmente: " + this.situacao);
        }
        else if(numeroDigitado == 2) {
            System.out.println("O aluno: " + aluno.get(2)+ " participante da disciplina: " + this.disciplina + "o aluno está atualmente: " + this.situacao);
        }
        else {
            System.out.println("O aluno não existe em nosso sistema");
        }
        
    }

    public void buscarAluno() {
    
        System.out.println("Digite o nome do aluno: ");    

        for (int i = 0; i < aluno.size(); i++) {
            System.out.println(aluno.get(i));
          }
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
