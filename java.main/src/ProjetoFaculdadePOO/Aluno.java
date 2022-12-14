package ProjetoFaculdadePOO;

import java.util.ArrayList;
import java.util.Scanner;

// classe modelo
class Aluno {
    Scanner entrada = new Scanner(System.in);

    // variables:
    public String disciplina = "";
    public String nome, situacao;
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
    
    public void adicionarDisciplina() {
        System.out.println("Qual é a sua disciplina: ");
        disciplina = entrada.next();
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

    //metodo para atualizar dados
    public void atualizarDados() {
        for(int i = 0; i < aluno.size();i++) {
            System.out.println((i + 1) + "-" + aluno.get(i));
        }

        System.out.println("Selecione o aluno para ser alterado:");
        int op = entrada.nextInt();
        
        if(op >= 1) {

            System.out.println("Gostaria de modificar o nome de " + aluno.get(op - 1) + " ?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int op1 = entrada.nextInt();

            if (op1 == 1){
                System.out.println("Digite o nome: ");
                String nome1 = entrada.next();
                aluno.set((op-1), nome1);
            }
            
            for(int i = 0; i < 3; i++) {
                System.out.println("Gostaria de modificar a " + (i+1) + "° nota de " + aluno.get(op - 1) + " ?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                op1 = entrada.nextInt();

                if (op1 == 1){
                    System.out.println("Digite a nota da N" + (i+1) + "?");
                    if (i == 0) {
                        nota1 = entrada.nextInt();
                        n1.set((op - 1), nota1);
                    } else if (i == 1) {
                        nota2 = entrada.nextInt();
                        n2.set((op - 1), nota2);
                    } else {
                        nota3 = entrada.nextInt();
                        n3.set((op - 1), nota3);
                    }
                }
            }
        }

        verificarNota();
        m.set((op - 1), media);
        
    }

    //metodo para buscar aluno
    public void buscarAluno() {

        //buscando aluno atráves do nome
        System.out.println("Digite o nome do aluno: ");
        nome = entrada.next();
        if(n1.isEmpty() == false){
            for (int i = 0; i < n1.size();) {
            
                System.out.println("Aluno encontrado: " + aluno.get(aluno.indexOf(nome)));
                System.out.println("Disciplina: " + disciplina);
                System.out.println("N1: " + n1.get(aluno.indexOf(nome)));
                System.out.println("N2: " + n2.get(aluno.indexOf(nome)));
                System.out.println("N3: " + n3.get(aluno.indexOf(nome)));
                System.out.println("Media: " + m.get(aluno.indexOf(nome)));
                break;    
            }
        }

        if (aluno.size() > n1.size()) {
                cont1 += n1.size();
                cont2 = n1.size();

            while(aluno.size() > cont2){

                System.out.println("Aluno encontrado: " + aluno.get(cont1));
                System.out.println("Disciplina: " + disciplina);
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
}