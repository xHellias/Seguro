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
     * @param args the command line arguments Realizar una aplicación de Java
     * consola utilizando POO que permita determinar el monto a pagar por
     * concepto de seguro de automóviles para vehículos con 10 o menos años de
     * antigüedad. Para esto debe solicitar : - Marca, modelo, valor UF del día
     * y año del vehículo. En base a lo anterior muestre el valor a pagar por
     * concepto de seguro o muestre "No asegurable" en el caso que el vehículo
     * tenga más de 10 años de antigüedad. Considere un valor de UF de $27.500
     */
    public static void main(String[] args) {
        // Creamos objetos de las clases 
        Seguro seguro = new Seguro();
        Vehiculo vehiculo = new Vehiculo();
        // Asignamos el valor de UF al seguro
        seguro.setValorUF(27500);
        // Creamos método para obtener datos del vehículo
        solicitarYCapturarDatos(vehiculo);
        // Invocamos el método que calcula la antigüedad
        vehiculo.calcularAntiguedad();
        // Calculamos el valor del seguro
        seguro.calcularValorSeguro(vehiculo.getAntiguedad());
        // Establecemos la propiedad si es asegurable o no
        vehiculo.setAsegurable(seguro.determinarAsegurabilidad(vehiculo.getAntiguedad()));
        // Mostramos los datos
        mostrarResultados(vehiculo, seguro);

    }

    private static void solicitarYCapturarDatos(Vehiculo vehiculo) {
        //Solicitamos y asignamos los datos
        solicitarMarca();
        String marca = capturarMarca();
        vehiculo.setMarca(marca);

        solicitarModelo();
        String modelo = capturarModelo();
        vehiculo.setModelo(modelo);

        solicitarAño();
        int año = capturarAño();
        vehiculo.setAño(año);

    }

    private static void solicitarMarca() {
        System.out.print("Ingrese marca     : ");
    }

    private static void solicitarModelo() {
        System.out.print("Ingrese modelo    : ");
    }

    private static void solicitarAño() {
        System.out.print("Ingrese año       : ");
    }

    private static String capturarMarca() {
        Scanner scanner = new Scanner(System.in);
        String marca = scanner.nextLine();
        return marca;
    }

    private static String capturarModelo() {
        Scanner scanner = new Scanner(System.in);
        String modelo = scanner.nextLine();
        return modelo;
    }

    private static int capturarAño() {
        Scanner scanner = new Scanner(System.in);
        int año = scanner.nextInt();
        return año;
    }

    public static void mostrarResultados(Vehiculo vehiculo, Seguro seguro) {
        if (vehiculo.isAsegurable()) {
            System.out.println("*****************");
            System.out.println("Marca del vehículo  : " + vehiculo.getMarca());
            System.out.println("Modelo del vehículo : " + vehiculo.getModelo());
            System.out.println("Año del vehículo    : " + vehiculo.getAño());
            System.out.println("El vehículo es asegurable");
            System.out.println("El valor del seguro es: $" + seguro.getValorSeguro());
        } else {
            System.out.println("El vehículo no es asegurable");
        }
    }
}
