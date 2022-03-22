package javacursocode;

public class ExercicioConceitosMain {
   public static void main(String [] args) {
    
    ExercicioConceitosP[] p = new ExercicioConceitosP[4];
    ExercicioConceitosL[] l = new ExercicioConceitosL[4];

     p[0] = new ExercicioConceitosP("Luis Carlos", 27, "Masculino");
     p[1] = new ExercicioConceitosP("Juliana Prestes", 18, "Feminino");
     p[2] = new ExercicioConceitosP("Carlos Sandrino", 22, "Masculino");

     l[0] = new ExercicioConceitosL("Crítica ao poder", "Luis Falorino", 235, false, p[0], 120);
     l[1] = new ExercicioConceitosL("Fome de amor", "Laura Justina", 122, false, p[3], 0);
     l[2] = new ExercicioConceitosL("Politcs", "Fredir Clark", 388, false, null, 0);

     l[0].abrirLivro();
     l[0].avancarPag();
     System.out.println(l[0].detalhes());
   } 
}
