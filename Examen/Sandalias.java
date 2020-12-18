package Examen;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sandalias extends Zapato{
    private double precio;

    public Sandalias(String marca, String color, String estilo, double talla, double precio){
        super(marca,color,estilo,talla);
        this.precio = precio;
    }

    public double getPrecio() {
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

    public String mostrarResul(){
        return "Datos de la Sandalia"
                + "\nPrecio: "+precio+ "\nMarca: "+getMarca()+ "\nColor: "+getColor()
                + "\nEstilo: "+getEstilo()+ "\nTalla: "+getTalla()+ "\n\n";
    }

    @Override
    public String Calzar() {
        return super.Calzar();
    }
}
