package Examen;
import java.io.File;
import java.util.Scanner;

public abstract class Zapato {
    private String nombreclase;
    private String marca;
    private String color;
    private String estilo;
    private double talla;

    public Zapato(String marca, String color, String estilo, double talla){
        this.marca = marca;
        this.color = color;
        this.estilo = estilo;
        this.talla = talla;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getEstilo(){
        return estilo;
    }

    public void setEstilo(String estilo){
        this.estilo = estilo;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getNombreclase() {
        return nombreclase;
    }

    public void setNombreclase(String nombreclase) {
        this.nombreclase = nombreclase;
    }

    public abstract void File(String fileName);

    public String Calzar(){
       return "\nQue bien me quedan estos "+nombreclase+ " que son talla "+talla+ "\n";
    }

}
