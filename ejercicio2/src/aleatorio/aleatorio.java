
package aleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class aleatorio {
    public static void numero
    {
        Random aleatorio = new Random();
        int excepcion = aleatorio.nextInt(5);

        switch (excepcion) {
            case 0:
                throw new NumberFormatException(" NumberFormatException");
            case 1:
                throw new IOException(" IOException");
            case 2:
                throw new FileNotFoundException(" FileNotFoundException");
            case 3:
                throw new IndexOutOfBoundsException(" IndexOutOfBoundsException");
            case 4:
                throw new ArithmeticException(" ArithmeticException");
            default:
                System.out.println("Se ha capturado la excepcion: FileNotFounException");
        }

    }
}
