package reporte6;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Reporte6 {
Scanner input = new Scanner (   source:System.in);
public void Reporte6 () {
    System.out.println(x:"Ingresa el capital");
    double c= input.nextDouble();
    System.out.println(x:"Ingresa la tasa de intereses");
    double r = input.nextDouble ();
    double t = input.nextDouble();
    
    double I = (t*r*c)/(100*360);
    double cap = c + I;
    System.out.println("Los intereses producidos son:" + I );
    System.out.println("El capital total acumulado es:" + cap);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reporte6 intereses = new Reporte6 ();
        intereses.Reporte6();
    }
    
}
