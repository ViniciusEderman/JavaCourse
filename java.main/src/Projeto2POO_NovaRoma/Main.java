package Projeto2POO_NovaRoma;

public class Main {
    public static void main(String[] args) {
        
        //instancia de objeto
        Conta p1 = new Conta();

        //chamando os metodos com a variavel de instancia
        p1.abrirConta("CC");
        p1.estadoAtual();
        p1.depositar(1000);
        p1.sacar(100);
        p1.taxa();

        Conta p2 = new Conta();
        p2.abrirConta("CP");
        p2.estadoAtual();
        p2.depositar(400);
        p2.sacar(50);
        p2.taxa();

    }
}
