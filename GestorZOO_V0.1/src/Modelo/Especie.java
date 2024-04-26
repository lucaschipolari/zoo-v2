package Modelo;

public class Especie {
    private String nombre;
    private double porcentajePesoCarnivoro;

    private TipoAlimentacion tipoAlimentacion;

    public Especie(String nombre, TipoAlimentacion tipoAlimentacion, double porcentajePesoCarnivoro) {
        this.nombre = nombre;
        if(tipoAlimentacion.esCarnivoro()){
            this.porcentajePesoCarnivoro = porcentajePesoCarnivoro;
        }
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPorcentajePesoCarnivoro() {
        return porcentajePesoCarnivoro;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
/*
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
}*/
