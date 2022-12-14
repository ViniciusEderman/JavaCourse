package ProjetoFaculdadePOO;

import java.util.ArrayList;
import java.util.Scanner;

// classe modelo
class Aluno {
    Scanner entrada = new Scanner(System.in);
    
    // variables:
    public String nome, situacao, disciplina;
    private float nota1, nota2, nota3, media;
    private float maior1 = 0, maior2 = 0, maior3 = 0, maiorM = 0, mediaTotal = 0;
    private int cont = 0, cont1 = 0, cont2 = 0;

    //utilizando Arraylist para adicionar dados
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
        this.nome = entrada.next();
        aluno.add(this.nome);
        
        // confirmação que o aluno foi adicionado
        System.out.println("Aluno adicinonado com sucesso");

    }

    // sobrecarga interir aluno
    public void setInserirAluno(String nome) {
        
        this.nome = nome;
        // confirmação que o aluno foi adicionado
        System.out.println("Aluno adicinonado com sucesso");

    }

    //metodo para remover alunos
    public void remover() {

        //remover dados de um aluno
        for (int i = 0; i < aluno.size(); i++) {
            System.out.println((i + 1) + "-" + aluno.get(i));
        }

        System.out.println("Selecione um número para Remover: ");
        int op = entrada.nextInt();
        
        //verificar se o aluno tem nota para remover
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

            //confirmação da remoção do aluno
            System.out.println("Aluno Removido com sucesso");
        }

    }

    //metodo para buscar aluno
    public void buscarAluno() {

        //buscando aluno atráves do nome
        System.out.println("Digite o nome do aluno: ");
        nome = entrada.next();
        if(n1.isEmpty() == false){
            for (int i = 0; i < n1.size(); i++) {
            
                System.out.println("Aluno encontrado: " + aluno.get(i));
                System.out.println("Disciplina: " + this.disciplina);
                System.out.println("N1: " + n1.get(aluno.indexOf(aluno.get(i))));
                System.out.println("N2: " + n2.get(aluno.indexOf(aluno.get(i))));
                System.out.println("N3: " + n3.get(aluno.indexOf(aluno.get(i))));
                System.out.println("Media: " + m.get(aluno.indexOf(aluno.get(i))));
                
            }
        }

        if (aluno.size() > n1.size()) {
            cont1 += n1.size();
            cont2 = n1.size();

            while(aluno.size() > cont2){

            System.out.println("Aluno encontrado: " + aluno.get(cont1));
            System.out.println("Disciplina: " + this.disciplina);
            System.out.println("Nenhuma nota encontrada no Sistema");
            cont1++;

            if(aluno.size() == cont1){
                break;
            }
            }
        }
        
    } 

    //Metodo para inserir Nota
    public void setInserirNota() {
        
        //Adicionando nota
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
        if (this.nota1 >= this.nota2 && this.nota2 > this.nota3 || this.nota2 >= this.nota1 && this.nota1 > this.nota3) {
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

    //Sobrecarga verificar nota
    public void verificarNota(int n1, int n2, int n3) {

        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        // Bloco de verificacao de quais notas entrarao na media
        if (this.nota1 >= this.nota2 && this.nota2 > this.nota3 || this.nota2 >= this.nota1 && this.nota1 > this.nota3) {
            media = (this.nota1 + this.nota2) / 2;
        } else if (this.nota2 > this.nota1 && this.nota3 > this.nota1) {
            media = (this.nota2 + this.nota3) / 2;
        } else if (this.nota1 > this.nota2 && this.nota3 > this.nota2) {
            media = (this.nota1 + this.nota3) / 2;
        }

        // bloco de verificacao de media:
        if (media > 5) {
            situacao = "aprovado";
            // System.out.println(situacao);
        } else if (media > 3 && nota3 == 0) {
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

    //metodo para lista de alunos
public void Resumo() {

        System.out.println("Resumo dos alunos: ");
        System.out.println("ID   |   NOME   |   N1   |   N2   |  N3   |   MÉDIA   |   SITUAÇÃO   ");
     
        if(n1.isEmpty() == false){
           for (int i = 0; i < n1.size(); i++) {   
                System.out.println((i + 1) + "   |   " + aluno.get(i) + "   |   " + n1.get(i) + "   |   " + n2.get(i) + "   |   "
                        + n3.get(i) + "   |   " +  m.get(i) + "   |   " + situacao);
         }
        } 
        
        if (aluno.size() > n1.size()) {
              cont1 += n1.size();
              cont2 = n1.size();
            while(aluno.size() > cont2){
                System.out.println((cont1) + "   |   " + aluno.get(cont1) + "   |    Nenhuma nota encontrada no sistema");
                cont1++;

                if(aluno.size() == cont1){
                    break;
                }
            }           
    } 
}

//metodo para saber o maior valor
public void CompararNotas() {
         
        //calculo da maior media
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

    //metodo para Relatorio de alunos
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

    // sobrescreve o metodo deixando o mais resumindo possível e imprimi a situacao do aluno
    public void SobrecristaResumoGeral() {
        CompararNotas();

        System.out.println("Nome da Disciplina: " + disciplina);
        System.out.println("Total de Alunos: " + aluno.size());
        System.out.println("Media Geral: " + (mediaTotal / cont));

        System.out.println("A situação do aluno é: " + situacao);
    }
}
// herança de curso em relação a aluno 
class Curso extends Aluno {
    public String curso;

    @Override
    public void ResumoGeral() {
        System.out.println("Nome do curso: " + curso);
        super.ResumoGeral();
    }

    @Override
    public void Resumo() {
        System.out.println("O aluno do curso: " + curso + "está:" + situacao);
        super.Resumo();
    }
}

class Materia extends Curso {
    public String materia;

    @Override
    public void buscarAluno() {
        System.out.println("O aluno: " + aluno + "Está matriculado no curso:" + curso + "de materia: " + materia);
        super.buscarAluno();
    }
}

class participarMonitoria extends Curso {
    public String nomeMonitoria;

    @Override
    public void buscarAluno() {
        System.out.println("O aluno: " + aluno + "matriculado no curso:" + curso + "está inscrito no projeto monitoria");
        super.buscarAluno();
    }
}

class Monitor extends Aluno {
    public String monitor;
    public String curso;
    

    @Override
    public void buscarAluno() {
        System.out.println("O aluno: " + aluno + "matriculado no curso:" + curso + "está inscrito no projeto monitoria");
        super.buscarAluno();
    }

    @Override
    public void verificarNota() {
        System.out.println("O aluno: " + aluno + "matriculado no curso:" + curso + "com nota maior que 09" + situacao + "está aprovado para monitor de sala");
        super.verificarNota();
    }
}
