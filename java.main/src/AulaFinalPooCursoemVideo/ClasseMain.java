package AulaFinalPooCursoemVideo;

public class ClasseMain {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Java");
        v[1] = new Video("Aula 2 de PHP");
        v[2] = new Video("Aula 1 de Python");

        Vizualizador x[] = new Vizualizador[3];
        x[0] = new Vizualizador("Vinicius Luiz", 25, "Male", "viniciusLuiz122");
        x[1] = new Vizualizador("Carlito Nhoque", 32, "Male", "acessaradm");
        x[2] = new Vizualizador("Emanuel Campos", 55, "Male", "acessadm");
    }
}
