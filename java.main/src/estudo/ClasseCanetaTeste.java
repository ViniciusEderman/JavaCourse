package estudo;

public class ClasseCanetaTeste {
    public static void main (String[] args) {
    // instanciando // 
    ClasseEmJava modeloCaneta = new ClasseEmJava();

    modeloCaneta.cor = "Azul";
    modeloCaneta.pontaDaCaneta = 0.5f;
    modeloCaneta.destampar();
    modeloCaneta.statusMetd();
    modeloCaneta.rabiscar();

    // nova caneta //
        //criar modelo // 
    
    ClasseEmJava modeloCaneta1 = new ClasseEmJava();

    modeloCaneta1.cor = "Preta";
    modeloCaneta1.pontaDaCaneta = 0.7f;
    modeloCaneta1.tampar();
    modeloCaneta1.statusMetd();
    modeloCaneta1.rabiscar();

    }  
}
