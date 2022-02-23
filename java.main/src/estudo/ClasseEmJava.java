package estudo;

public class ClasseEmJava {
    
        String modelo;
        String cor;
        float pontaDaCaneta;
        int carga;
        boolean tampada; 

        void statusMetd() {
                System.out.println("Uma caneta " + this.cor + " " + this.pontaDaCaneta + " " + this.tampada);
                System.out.println("Está tampada?" + " " + this.tampada);
        }
        void rabiscar() {
                if(this.tampada == true) {
                        System.out.print("Não permitido");
                }else{
                        System.out.print("Rasbincando...");
                }
        }
        void tampar() {
                this.tampada = true;
        }
        void destampar() {
                this.tampada= false;
        }
// void (não retorna nada)
// Metódo principal(main) //  
// classificar a classe com 1 letra em caps // 
}