package Modelo;

public class Pais {
    // Atributos
    private String nombrePais;
    //
    
    //Getters y Setters
    public String getNombrePais() {
        return nombrePais;
    }
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    //
    
    //Constructores
    public Pais(){
        
    }
    public Pais(String nombre){
        this.nombrePais = nombre;
    }
    //
}
