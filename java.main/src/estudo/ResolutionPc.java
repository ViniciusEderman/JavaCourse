package estudo;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolutionPc {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Resolução - largura = " + d.width);    
        System.out.println("Screen - altura = " + d.height);  
    }    
}

