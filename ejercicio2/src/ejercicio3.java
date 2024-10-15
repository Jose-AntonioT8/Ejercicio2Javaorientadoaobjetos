import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import aleatorio.aleatorio;

public class ejercicio3 {

    public static void main(String[] args) throws Exception {
        Random aleatorio = new Random();
        int excepcion = aleatorio.nextInt(5);
        try {
            aleatorio.numero();
        } catch (NumberFormatException e) {
            System.out.println("Se ha capturado la excepcion:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Se ha capturado la excepcion:" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Se ha capturado la excepcion:" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Se ha capturado la excepcion:" + e.getMessage());
        }
    }
}
