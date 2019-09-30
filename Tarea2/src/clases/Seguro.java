package clases;

/**
 *
 * @author xHellias
 */
public class Seguro {
    private double valorSeguro;
    private double valorUF;

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getValorUF() {
        return valorUF;
    }
    
    public void setValorUF(double valorUF) {
        this.valorUF = valorUF;
    }
    
    public boolean determinarAsegurabilidad(int antiguedad) {
        boolean asegurable;
        if (antiguedad<=10) {
            asegurable = true;
        } else{
            asegurable = false;
        }
        return asegurable;
    }
    
    public void calcularValorSeguro(int antiguedad){
        this.valorSeguro = (antiguedad * valorUF)/10;
    }

    
}
