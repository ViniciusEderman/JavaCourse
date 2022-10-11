package ProjetoFaculdadePOO;
import java.util.Scanner;

class Student {
    public static void main (String [] args) {
        //declaracao de variavel media, que irá receber as notas a partir dos if's encadeados de verificacao
        float media;

        // criando o objeto para entrada de dados
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
        if(nota1 >= nota2 && nota2 > nota3) {
            media = (nota1 + nota2)/2;
        }
        if(nota1 < nota2 && nota2 <= nota3) {
            media = (nota2 + nota3)/2;
        }
        if(nota1 > nota2 && nota3 > nota2) {
            media = (nota1 + nota3)/2;
        }

        //bloco de verificacao de media
        if(media >= 6) {
            System.out.println("O aluno "+nome+ " foi aprovado "+ "na disciplina: "+disciplina);
        }
        if(media < 6 && media >= 4 || nota3 == 0) {
            System.out.println("O aluno "+nome+ " está de recuperação "+"na disciplina: "+disciplina);
        }
        if(media < 6) {
            System.out.println("O aluno "+nome+ " foi reprovado "+"na disciplina: "+disciplina);
        }
        keyboard.close();
    }
}