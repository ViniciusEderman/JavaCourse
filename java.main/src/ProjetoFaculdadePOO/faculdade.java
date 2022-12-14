package ProjetoFaculdadePOO;

import java.util.Scanner;

public class faculdade extends Polo {

    Scanner entrada = new Scanner(System.in);
    public String curso;
    public String nome;
    public String turno;
    public String disciplina;
    
    
    public String local() {
        System.out.println("Digite o local da faculdade: (digite sair para desligar o programa)");
        return local = entrada.next();
    }
}
//heranças
class cursos extends faculdade {

    public void nomeDoCurso() {
        System.out.println("Digite o nome do curso: ");
        curso = entrada.next();
    }
}

class professor extends faculdade {

    public void nomeProfessor(){
        System.out.println("Digite o seu nome: ");
        nome = entrada.next();
    }

    public String turno() {
        return "Noturno";
    }
}

class disciplina extends cursos {

    public void adicionarDisciplina() {
        System.out.println("Qual é a sua disciplina: ");
        disciplina = entrada.next();
    }
}


