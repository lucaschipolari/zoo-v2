package Modelo;

public class Persona {
    
    //Atributos
    private int dni;
    private String nombres;
    private String apellidos;
    private String domicilio;
    //
    
    //Getter y Setters
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    //
    
    //Constructores
    public Persona(){
        
    }
    public Persona(int dni, String nombres, String apellidos, String domicilio){
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
    }
    //
}
