package ProjetoFaculdadePOO;

import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    // variables:
    Scanner entrada = new Scanner(System.in);

    private String nome, situacao, disciplina;
    private float nota1, nota2, nota3, media;
    ArrayList<String> aluno = new ArrayList<>();

    ArrayList<Float> n1 = new ArrayList<>();
    ArrayList<Float> n2 = new ArrayList<>();
    ArrayList<Float> n3 = new ArrayList<>();
    ArrayList<Float> m = new ArrayList<>();

    ArrayList<Float> resumo = new ArrayList<>();

    // construtor:
    public Aluno() {
        // situacao == aprovado, reprovado e de recuperacao
        this.disciplina = "Matemática";
    }

    // sobrecarga do construtor aluno
    public Aluno(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.disciplina = "Matemática";
    }

    // metódo para inserir alunos no array
    public void setInserirAluno() {

        // insere alunos
        System.out.println("Digite o nome do aluno: ");
        this.nome = entrada.nextLine();
        aluno.add(nome);

        // printa o aluno
        System.out.println("Aluno adicinonado com sucesso");
    }

    public void remover() {

        for (int i = 0; i < aluno.size(); i++) {
            System.out.println((i + 1) + "-" + aluno.get(i));
        }

        System.out.println("Selecione um número para Remover: ");
        int op = entrada.nextInt();

        if (op == 1) {
            aluno.remove(op - 1);
            System.out.println("Aluno Removido");
        } else if (op <= aluno.size() && op != 0) {
            aluno.remove(op - 1);
            System.out.println("Aluno Removido com sucesso");
        }
    }


    public void buscarAluno() {

        System.out.println("Digite o nome do aluno: ");

        for (int i = 0; i < aluno.size(); i++) {
            System.out.println(aluno.get(i));
        }
    }

    public void setInserirNota() {

        System.out.println("Digite a nota da N1: ");
        nota1 = entrada.nextInt();

        System.out.println("Digite a nota da N2: ");
        nota2 = entrada.nextInt();

        System.out.println("Digite a nota do N3: ");
        nota3 = entrada.nextInt();

        n1.add(nota1);
        n2.add(nota2);
        n3.add(nota3);
    }

    // metodo de verificarNota
    public void verificarNota() {

        // Bloco de verificacao de quais notas entrarao na media
        if (this.nota1 >= this.nota2 && this.nota2 > this.nota3 || this.nota2 > this.nota1) {
            media = (this.nota1 + this.nota2) / 2;
        } else if (this.nota2 > this.nota1 && this.nota3 > this.nota1) {
            media = (this.nota2 + this.nota3) / 2;
        } else if (this.nota1 > this.nota2 && this.nota3 > this.nota2) {
            media = (this.nota1 + this.nota3) / 2;
        }

        // bloco de verificacao de media:
        if (media >= 6) {
            situacao = "aprovado";
            // System.out.println(situacao);
        } else if (media >= 4 && nota3 == 0) {
            situacao = "recuperação";
            // System.out.println(situacao);
        } else if (media < 6) {
            situacao = "reprovado";
            // System.out.println(situacao);
        }

        m.add(media);
    }

    public void Resumo() {
        System.out.println("=====================================");
        System.out.println("Resumo dos alunos: ");
        System.out.println("ID   |   NOME   |   N1   |   N2   |  N3   |   MÉDIA   |   SITUAÇÃO   ");
        for (int i = 0; i < aluno.size(); i++) {
            System.out.println((i + 1) + "   |   " + aluno.get(i) + "   |   " + n1.get(i) + "   |   " + n2.get(i) + "   |   "
                    + n3.get(i) + "   |   " + m.get(i) + "   |   " + situacao);
        }
    }
}
