package javacursocode;

public class BancoMain {
    public static void main(String[] agrs){
        Banco user1 = new Banco();
        user1.setnumConta(232514);
        user1.setdonoConta("Carlos Alberto");
        user1.abrirConta("CC");
        user1.depositar(590.00f);
        user1.estadoAtual();
        user1.sacar(100.00f);
        
        System.out.println("________________________");

        Banco user2 = new Banco();
        user2.setnumConta(231411);
        user2.setdonoConta("Luiza Balierto");
        user2.abrirConta("CP");
        user2.depositar(8520.00f);
        user2.estadoAtual();
        user2.sacar(500.00f);
    }
}
