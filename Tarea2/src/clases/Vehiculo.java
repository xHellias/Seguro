package clases;

import java.util.Calendar;

/**
 *
 * @author xHellias
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private int antiguedad;
    private boolean asegurable;

    public boolean isAsegurable() {
        return asegurable;
    }

    public void setAsegurable(boolean asegurable) {
        this.asegurable = asegurable;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    //Calculamos la antigüedad del vehículo
    public void calcularAntiguedad() {
        int ano_actual = Calendar.getInstance().get(Calendar.YEAR);
        this.antiguedad = ano_actual - this.año;
    }
}
