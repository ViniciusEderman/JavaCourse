package ProjetoFaculdadePOO;

import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    // variables:
    Scanner entrada = new Scanner(System.in);

    private String nome, situacao, disciplina;
    private float nota1, nota2, nota3, media;
    private float maior1 = 0, maior2 = 0, maior3 = 0, maiorM = 0, mediaTotal = 0;
    private int cont = 0;

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
            if (n1.isEmpty() == false){
                n1.remove(op - 1);
                n2.remove(op - 1);
                n3.remove(op - 1);
            }

            if ( m.isEmpty() == false) {
                m.remove(op - 1);
            }
            System.out.println("Aluno Removido");
        } else if (op <= aluno.size() && op != 0) {
            aluno.remove(op - 1);
            if (n1.isEmpty() == false == false) {
                n1.remove(op - 1);
                n2.remove(op - 1);
                n3.remove(op - 1);

                if (m.isEmpty() == false) {
                    m.remove(op - 1);
                }
            }
            System.out.println("Aluno Removido com sucesso");
        }

    }

    public void buscarAluno() {

        System.out.println("Digite o nome do aluno: ");
        nome = entrada.nextLine();
        for (int i = 0; i < aluno.size(); i++) {
            if (aluno.get(i).equalsIgnoreCase(nome)) {
                System.out.println("Aluno encontrado: " + aluno.get(i));
                System.out.println("Disciplina: " + this.disciplina);
                System.out.println("N1: " + n1.get(aluno.indexOf(aluno.get(i))));
                System.out.println("N2: " + n2.get(aluno.indexOf(aluno.get(i))));
                System.out.println("N3: " + n3.get(aluno.indexOf(aluno.get(i))));
                System.out.println("Media: " + m.get(aluno.indexOf(aluno.get(i))));
            }
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
        if (this.nota1 >= this.nota2 && this.nota2 > this.nota3 || this.nota2 >= this.nota1) {
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

        cont++;
        mediaTotal += media;

        m.add(media);
    }

    public void Resumo() {

        System.out.println("Resumo dos alunos: ");
        System.out.println("ID   |   NOME   |   N1   |   N2   |  N3   |   MÉDIA   |   SITUAÇÃO   ");
        for (int i = 0; i < aluno.size(); i++) {
            System.out.println(
                    (i + 1) + "   |   " + aluno.get(i) + "   |   " + n1.get(i) + "   |   " + n2.get(i) + "   |   "
                            + n3.get(i) + "   |   " + m.get(i) + "   |   " + situacao);
        }

    }

    public void CompararNotas() {

        for (int i = 0; i < aluno.size(); i++) {

            if (n1.get(i) > maior1) {
                maior1 = n1.get(i);
            }

            if (n2.get(i) > maior2) {
                maior2 = n2.get(i);
            }

            if (n3.get(i) > maior3) {
                maior3 = n3.get(i);
            }

            if (m.get(i) > maiorM) {
                maiorM = m.get(i);
            }
        }
    }

    public void ResumoGeral() {
        CompararNotas();

        System.out.println("Nome da Disciplina: " + disciplina);
        System.out.println("Total de Alunos: " + aluno.size());
        System.out.println("Media Geral: " + (mediaTotal / cont));

        System.out.println("Maior Nota 1: " + maior1);
        System.out.println("\tAluno: " + aluno.get(n1.indexOf(maior1)));
        System.out.println("\tMédia: " + m.get(n1.indexOf(maior1)));

        System.out.println("Maior Nota 2: " + maior2);
        System.out.println("\tAluno: " + aluno.get(n2.indexOf(maior2)));
        System.out.println("\tMédia: " + m.get(n2.indexOf(maior2)));

        System.out.println("Maior Nota 3: " + maior3);
        System.out.println("\tAluno: " + aluno.get(n3.indexOf(maior3)));
        System.out.println("\tMédia: " + m.get(n3.indexOf(maior3)));

        System.out.println("Maior Média: " + maiorM);
        System.out.println("\tAluno: " + aluno.get(m.indexOf(maiorM)));
        System.out.println("\tMédia: " + m.get(m.indexOf(maiorM)));
    }
}
