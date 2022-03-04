package javacursocode;

public class BancoMain {
    public static void main(String[] agrs){
        Banco user1 = new Banco();
        user1.setnumConta(232514);
        user1.setdonoConta("Carlos Alberto");
        user1.abrirConta("CC");
        user1.depositar(590);
        user1.sacar(100);
        user1.estadoAtual();
        
        System.out.println("________________________");

        Banco user2 = new Banco();
        user2.setnumConta(231411);
        user2.setdonoConta("Luiza Balierto");
        user2.abrirConta("CP");
        user2.depositar(8520.00f);
        user2.sacar(500);
        user2.estadoAtual();

        Banco user3 = new Banco();
        user3.setnumConta(231721);
        user3.setdonoConta("André Luís");
        user3.abrirConta("CC");
        user3.depositar(12500.90f);
        user3.sacar(1000);
        user3.estadoAtual();

        Banco user4 = new Banco();
        user4.setnumConta(235012);
        user4.setdonoConta("Zé Carlos");
        user4.abrirConta("CC");
        user4.depositar(1250.50f);
        user4.sacar(100);
        user4.estadoAtual();
    }
}
