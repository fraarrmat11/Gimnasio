import java.time.LocalDate;

public class Pesaje {
    //ATRIBUTOS
    private double peso;
    private LocalDate fecha;
    private Cliente cliente;
    //CONSTRUCTOR
    public Pesaje(double peso,LocalDate fecha){
        this.peso = peso;
        this.fecha = fecha;
    }
    //METODOS
    public String getImc(){
        if ((peso/(Math.pow(2,cliente.clienteEdad()))<18.5))
            return "Bajo peso (IMC < 18,5)";
        else if ((peso/(Math.pow(2,cliente.clienteEdad()))<24.99&&(peso/(Math.pow(2,cliente.clienteEdad()))>18.5)))
            return "Rango normal (IMC = 18,5-24,99)";
        else if ((peso/(Math.pow(2,cliente.clienteEdad()))<29.99&&(peso/(Math.pow(2,cliente.clienteEdad()))>25)))
            return "Sobrepeso (IMC = 25-29,99)";
        else
            return "Obeso (IMC >= 30,00)";



    }
}
