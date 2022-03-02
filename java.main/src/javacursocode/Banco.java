package javacursocode;

class Banco {
    // Atributos criado para o banco //

    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;

    // Iniciando os métodos // 

    public Banco(float s, boolean st) {
        saldoConta = s;
        s = 0;
        statusConta = st;
        st = false;
    }
    public void setnumConta(int n){
        numConta = n;
    }
    public int getnumConta() {
        return numConta;
    }
    public void settipoConta(String t) {
        tipoConta = t;
    }
    public String gettipoConta() {
        return tipoConta;
    }
    public void setdonoConta(String d) {
        donoConta = d;
    }
    public String getdonoConta() {
        return donoConta;
    }
    public void setsaldoConta(float s) {
        saldoConta = s;
    }
    public float getsaldoConta() {
        return saldoConta;
    }
    public void setstatusConta(boolean st) {
        statusConta = st;
    }
    public boolean getstatusConta() {
        return statusConta;
    }  
    public void abrirConta(String t) {
        settipoConta(t);
        setstatusConta(true);
         if (t == "CC") {
             saldoConta = 50.00f;
         }
         if (t == "CP") {
             saldoConta = 150.00f;
         }
    }
    public void fecharConta() {
        if (saldoConta > 0) {
            System.out.println("Conta ainda com dinheiro, não permitido o fechamento");
        }
        if (saldoConta < 0) {
            System.out.println("Conta no negativo, não permitido o fechamento");
        }
        else {
            setstatusConta(false);
        }
    }
    public void depositar(float v) {
        if (statusConta == true) {
            saldoConta += v;
        }
        else {
            System.out.println("Conta fechada, não possível depositar nenhum valor");
        }
    }
    public void sacar(float v) {
        if (statusConta = true) {
          if(saldoConta > v) {
              saldoConta = saldoConta - v; 
          }
        
          else {
            System.out.println("Saldo insuficiente");
        }
    }
        else {
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensalidade() {
        float value;
        value = 0;
        // condição para mensalidade // 
         if (tipoConta == "CC") {
             value = 12.00f;
         }
         else if (tipoConta == "CP") {
             value = 20.00f;
         }
         if (statusConta == true) {
           if (saldoConta > value) {
               saldoConta = saldoConta - value;
            }
            else {
              System.out.println("Saldo insuficiente");
            } }
         else {
            System.out.println("Impossível pagar");
         }    
    }
}
