package javacursocode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pares {

    public static void main(String[] args) throws IOException {

        String objeto;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        objeto = br.readLine();
        
        for (int i = 2; i <= Integer.parseInt(objeto); i++) {
          if (i % 2 == 0) {
            System.out.println(i);
          }
        }
    }
}

//código para a DIO //