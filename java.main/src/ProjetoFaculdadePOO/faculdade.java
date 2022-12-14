package ProjetoFaculdadePOO;

import java.util.Scanner;

public class faculdade {
    
    Scanner entrada = new Scanner(System.in);
    private String local;
    private String curso;
    private int qtd;
    
    public String local() {
        return local = entrada.next();
    }

    public int funcionarios(int qtd) {
        this.qtd = qtd;
        return this.qtd = 40;
    }

}

class monito extends faculdade {

}
class cursos extends faculdade {

}

class professor extends faculdade {
    
}

class materia extends cursos {

}


