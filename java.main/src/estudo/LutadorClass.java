package estudo;

public class LutadorClass {
    public static void main(String[] args) {
        LutadorFirstClass l = new LutadorFirstClass("Carlos Alberto", "brasileiro", 27, 1.85, 75.9, 17, 3, 1);
        l.status();

        LutadorFirstClass l_2[] = new LutadorFirstClass[3];

        l_2[0] = new LutadorFirstClass("Lucas Lu", "brasileiro", 35, 1.90, 80.9, 21, 6, 4);

        l_2[1] = new LutadorFirstClass("Isaac Chiento", "france", 29, 1.69, 65.4, 7, 0, 1);

        l_2[2] = new LutadorFirstClass("Vinicius Carlo", "france", 22, 1.75, 69.0, 13, 0, 0);
        
       ClassFight UEC0 = new ClassFight();
       UEC0.marcarLuta(l_2[0], l_2[1]);
       UEC0.lutar();
    }
}
