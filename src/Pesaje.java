import java.time.LocalDate;

public class Pesaje {
    //ATRIBUTOS
    private double peso;
    private LocalDate fecha;
    private Cliente cliente;

    //CONSTRUCTOR
    public Pesaje( Cliente cliente,double peso,LocalDate fecha){
        this.peso = peso;
        this.fecha = fecha;
    }
    //METODOS
    public String getImc(){
        if ((peso/(Math.pow(cliente.getAltura(),2))<18.5))
            return "Bajo peso (IMC < 18,5)";
        else if ((peso/(Math.pow(cliente.getAltura(),2))<24.99&&(peso/(Math.pow(2,cliente.clienteEdad()))>18.5)))
            return "Rango normal (IMC = 18,5-24,99)";
        else if ((peso/(Math.pow(cliente.getAltura(),2))<29.99&&(peso/(Math.pow(2,cliente.clienteEdad()))>25)))
            return "Sobrepeso (IMC = 25-29,99)";
        else
            return "Obeso (IMC >= 30,00)";
    }
    public double calcularGrasa(){
        return -44.988 + (0.503 * cliente.getAltura()) + (10.689 * cliente.getAltura()) + (3.172 * peso/(Math.pow(cliente.getAltura(),2))) - (0.026 * Math.pow(peso/(Math.pow(cliente.clienteEdad(),2)),2) ) + (0.181 * peso/(Math.pow(cliente.getAltura(),2)) * cliente.getSexo()) - (0.02 * peso/(Math.pow(cliente.getAltura(),2)) * cliente.clienteEdad()) - (0.005 * Math.pow(peso/(Math.pow(cliente.getAltura(),2)),2) * cliente.getSexo()) + (0.00021 * Math.pow(peso/(Math.pow(cliente.getAltura(),2)),2) * cliente.clienteEdad());
    }
    public String getGrasa(){
        if (cliente.getSexo()==1) {
            if (calcularGrasa() < 10)
                return "Grasa escasa: <10% (mujeres), <2% (hombres)";
            if (calcularGrasa() <= 13 && calcularGrasa() >= 10)
                return "Grasa esencial: 10-13% (mujeres), 2-5% (hombres)";
            if (calcularGrasa() <= 20 && calcularGrasa() >= 14)
                return "Deportistas: 14-20 % (mujeres), 6-13 % (hombres)";
            if (calcularGrasa() <= 24 && calcularGrasa() >= 21)
                return "Fitness: 21-24 % (mujeres), 14-17 % (hombres)";
            if (calcularGrasa() <= 31 && calcularGrasa() >= 25)
                return "Promedio: 25-31 % (mujeres), 18-24 % (hombres)";
            else
                return "Obesos: 32 %+ (mujeres), 25 %+ (hombres)";
        }
        else {
            if (calcularGrasa() < 2)
                return "Grasa escasa: <10% (mujeres), <2% (hombres)";
            if (calcularGrasa() <= 5 && calcularGrasa() >= 2)
                return "Grasa esencial: 10-13% (mujeres), 2-5% (hombres)";
            if (calcularGrasa() <= 13 && calcularGrasa() >= 6)
                return "Deportistas: 14-20 % (mujeres), 6-13 % (hombres)";
            if (calcularGrasa() <= 17 && calcularGrasa() >= 14)
                return "Fitness: 21-24 % (mujeres), 14-17 % (hombres)";
            if (calcularGrasa() <= 24 && calcularGrasa() >= 18)
                return "Promedio: 25-31 % (mujeres), 18-24 % (hombres)";
            else
                return "Obesos: 32 %+ (mujeres), 25 %+ (hombres)";
        }

    }
    public double getTMB(){
        if (cliente.getSexo()==1)
            return 10*peso+6.25* cliente.getAltura()-5* cliente.clienteEdad()-161;
        else
            return 10*peso+6.25* cliente.getAltura()-5* cliente.clienteEdad()+5;
    }
}
