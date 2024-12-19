import java.time.LocalDate;

public class Cliente {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private String DNI;
    private boolean sexo;
    private int altura;
    private Pesaje[] pesajes;
    //CONSTRUCTOR
    public Cliente(String nombre,String apellido, int edad, LocalDate fechaNacimiento, String DNI, boolean sexo, int altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
        this.altura = altura;

    }
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDNI() {
        return DNI;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public int getAltura() {
        return altura;
    }
    public int getSexo(){
        if (sexo)
            return 1;
        return 0;
    }
    //METODOS
    public int clienteEdad(){
        return fechaNacimiento.getYear() - LocalDate.now().getYear();
    }


}
