import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Interface inicial.
    char valor = JOptionPane.showInputDialog(
            null,
            "Ingrese el numero segun la opción que requiera\n" +
                    "1-Soles peruanos a dolares\n" +
                    "2-Pesos mexicanos a dolares\n"+
                    "3-Pesos colombianos a dolares\n"+
                    "4-Salir",
            "Opciones",
            JOptionPane.INFORMATION_MESSAGE).charAt(0)  ;
    // Operaciones segun la opcion escogida
    EXTERNO:
    switch (valor){
        case '1':
            convertir(3.78); //"Soles peruanos"
            break;
            case '2':
                convertir(18.11); //"Pesos mexicanos"
                break;
            case'3':
                convertir(4761.00); //"Pesos colombianos"
                break;
            case'4':
                System.out.println("Programa finalizado");
                break EXTERNO;
            default:
                System.out.println("OPCION NO CONTEMPLADA");
                break;
        }
    }
    // Funcion convertir moneda local en dolares
    static void convertir(double valorDolar){
        // El usuario ingresa la cantidad a convertir
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Cuanto dinero desea convertir a dolares",
                "Cantidad de dinero"));
        double cantidadDolares = cantidad / valorDolar;
        cantidadDolares = (double) Math.round(cantidadDolares * 100d)/100; // redondeando la cantidad final
        JOptionPane.showMessageDialog(
        null,
                "su dinero equivale a: " + cantidadDolares + " dolares.",
        "Resultado",
                JOptionPane.INFORMATION_MESSAGE );
    }
}