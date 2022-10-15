package ProjetoFaculdadePOO;
import java.util.Scanner;

class Aluno {

    //atributes(variaveis usadas no construtor) 
    private String nome, situacao;
    private float nota1, nota2, nota3, media;
    

    public Aluno(String nome, float nota1, float nota2, float nota3, String situacao) {
        // situacao == aprovado, reprovado e de recuperacao
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.situacao = situacao;
    }

    private Aluno(String disciplina) {
        disciplina = "matemática";
        System.out.println(disciplina);
    }

    static void setInserirAluno() {

        Scanner entrada = new Scanner(System.in);

        String arrayAluno[] = new String[10];

        for(int i = 0; i < 10; i++) {

            System.out.println("Digite o nome do aluno: ");
            arrayAluno[i] = entrada.nextLine();
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(arrayAluno[i]);
        }
        
        entrada.close();
    }
    
    public static void main (String [] args) {
        //declaracao de variavel media, que irá receber as notas a partir dos if's encadeados de verificacao
        float media;

        // instanciando o objeto keyboard
        Scanner keyboard = new Scanner(System.in);

        /*bloco de criacao das variaveis nome, disciplina, notas(1,2 e 3) 
        Aqui e mostrado um print e dps o valor sera armazenado nas variaveis utilizando o objeto keyboard 
        */
        System.out.println("Digite o nome do aluno: ");
        String nome = keyboard.nextLine();

        System.out.println("Digite o nome da disciplina: ");
        String disciplina = keyboard.nextLine();

        System.out.print("Digite a nota1 do aluno: ");
        float nota1 = keyboard.nextFloat();

        System.out.print("Digite a nota2 do aluno: ");
        float nota2 = keyboard.nextFloat();

        System.out.print("Digite a nota3 do aluno: ");
        float nota3 = keyboard.nextFloat();

        //iniciando valor da variavel para rodar o codigo
        media = 0;

        //Bloco de verificacao de quais notas entrarao na media
        if(nota1 >= nota2 && nota2 > nota3 || nota2 > nota1) {
            media = (nota1 + nota2)/2;
        }
        if(nota2 > nota1 && nota3 > nota1) {
            media = (nota2 + nota3)/2;
        }
        if(nota1 > nota2 && nota3 > nota2) {
            media = (nota1 + nota3)/2;
        }

        //System.out.println(media);

        //bloco de verificacao de media
        if(media >= 6) {
            System.out.println("O aluno "+nome+ " foi aprovado "+ "na disciplina:\n "+disciplina+"\n" + "a média do aluno foi:\n " +media);
        }
        if(media >= 4 && nota3 == 0) {
            System.out.println("O aluno "+nome+ "está de recuperação "+"na disciplina:\n "+disciplina+"\n" + "a média do aluno foi:\n" +media);
        }
        if(media < 6) {
            System.out.println("O aluno "+nome+ " foi reprovado "+"na disciplina:\n "+disciplina+"\n" + "A média do aluno foi:\n" +media);
        }
        keyboard.close();
    }
}