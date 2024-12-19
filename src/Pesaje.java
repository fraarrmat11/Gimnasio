import java.time.LocalDate;

public class Pesaje {
    //ATRIBUTOS
    private double peso;
    private LocalDate fecha;
    //CONSTRUCTOR
    public Pesaje(double peso,LocalDate fecha){
        this.peso = peso;
        this.fecha = fecha;
    }
    //METODOS
    public String getImc(){
        return "hola";
    }
}
