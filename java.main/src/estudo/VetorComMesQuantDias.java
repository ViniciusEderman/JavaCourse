package Estudo;

public class VetorComMesQuantDias {
    public static void main(String[] args) {
        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        int dias [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int cont = 0; cont< mes.length; cont++) {
            System.out.println("O mês de " + mes[cont] + " tem " + 
            dias[cont] + " dias ao total.");
        }
    }
}
