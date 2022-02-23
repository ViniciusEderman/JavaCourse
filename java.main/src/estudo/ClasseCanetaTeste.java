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
    
    }  
}
