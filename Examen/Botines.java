package Examen;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Botines extends Zapato{
    private double precio;

    public Botines(String marca, String color, String estilo, double talla, double precio){
        super(marca,color,estilo,talla);
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void File(String fileName){
        FileWriter escribirarchivo = null;
        try{
            File archivo = new File(fileName);
            escribirarchivo = new FileWriter(archivo,true);
            escribirarchivo.write(mostrarResul());
            escribirarchivo.write(Calzar());
        } catch (IOException ex){
            System.err.println("Error "+ex);
        }finally{
            try{
                escribirarchivo.close();
            } catch (IOException ex){
            }
        }
    }

    @Override
    public String Calzar() {
        return super.Calzar();
    }

    @Override
    public String getNombreclase() {
        return super.getNombreclase();
    }

    @Override
    public void setNombreclase(String nombreclase) {
        super.setNombreclase(nombreclase);
    }

    public String mostrarResul(){
        return "Datos del Botin"
                + "\nPrecio: "+precio+ "\nTalla: "+getTalla()+ "\nEstilo: "+getEstilo()
                + "\nMarca: "+getMarca()+ "\nColor: "+getColor()+ "\n\n";
    }

}
