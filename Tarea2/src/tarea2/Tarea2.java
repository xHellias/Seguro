package tarea2;

import clases.Seguro;
import clases.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author xHellias
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     * Realizar una aplicación de Java consola utilizando POO 
     * que permita determinar el monto a pagar por concepto de seguro 
     * de automóviles para vehículos con 10 o menos años de antigüedad.
     * Para esto debe solicitar :
     * - Marca, modelo, valor UF del día y año del vehículo.
     * En base a lo anterior muestre el valor a pagar por concepto de seguro
     * o muestre "No asegurable" en el caso que el vehículo tenga más
     * de 10 años de antigüedad.
     * Considere un valor de UF de $27.500
     */
    public static void main(String[] args) {
        // Creamos objetos de las clases 
        Seguro seguro = new Seguro();
        Vehiculo vehiculo = new Vehiculo();
        // Asignamos el valor de UF al seguro
        seguro.setValorSeguro(27500);
        // Creamos método para obtener datos del vehículo
        solicitarYCapturarDatos(vehiculo);
        
        vehiculo.calcularAntiguedad();
        seguro.calcularValorSeguro(vehiculo.getAntiguedad());
        mostrarResultados(vehiculo, seguro);
    
    }

    private static void solicitarYCapturarDatos(Vehiculo vehiculo) {
        // Declaramos variables temporales
        Scanner scanner = new Scanner(System.in);
        String marca;
        String modelo;
        int año;
        System.out.print("Ingrese marca del vehículo    : ");
        marca = scanner.nextLine();
        System.out.print("Ingrese modelo del vehículo   : ");
        modelo = scanner.nextLine();
        System.out.print("Ingrese año del vehículo      : ");
        año = scanner.nextInt();
        // Establecemos los datos
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setAño(año);
        
    }
    public static void mostrarResultados(Vehiculo vehiculo, Seguro seguro) {
        if (vehiculo.isAsegurable()) {
            System.out.println("El vehículo es asegurable");
            System.out.println("El valor del seguro es: $" + seguro.getValorSeguro());
        } else {
            System.out.println("El vehículo no es asegurable");
        }
    }
    
}
