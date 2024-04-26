package Modelo;

public class Especie {
    //Atributos
    private String denominacion;
    //
    
    //Getter y Setters
    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    //
    
    //Constructores
    public Especie(){
        
    }
    public Especie(String denominacion){
        this.denominacion = denominacion;
    }
    //
}
