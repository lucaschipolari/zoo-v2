package Modelo;

import java.util.InvalidPropertiesFormatException;

public abstract class Animal {
    //Atributos
    protected int idAnimal;
    protected Pais paisOrigen;
    protected Especie especieEjemplar;
    protected double peso;
    
    //
    protected int edad;
    protected Pais origen;
    protected Especie especie;
    protected Sector sector;
    protected TipoAlimentacion tipoAlimentacion;

  protected Animal(TipoAlimentacion tipoAlimentacion, int edad, double peso, Pais origen, Especie especie, Sector sector) throws IllegalArgumentException, InvalidPropertiesFormatException {
    if (origen == null) throw new IllegalArgumentException();
    if (especie == null) throw new IllegalArgumentException();
    if (sector == null) throw new IllegalArgumentException();
    if (especie.getTipoAlimentacion() != tipoAlimentacion) throw new InvalidPropertiesFormatException("El animal no puede pertenecer a la especie");

    this.tipoAlimentacion = tipoAlimentacion;
    this.edad = edad;
    this.peso = peso;
    this.origen = origen;
    this.especie = especie;
    this.especieEjemplar = especie; // Asignación de especie a especieEjemplar
    this.sector = sector;
    sector.agregarAnimal(this);
}

    public abstract double calcularCantidadDeComida();
    
    //Getter y Setters
    public int getIdAnimal() {
        return idAnimal;
    }
    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }
    public Pais getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(Pais paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public Especie getEspecieEjemplar() {
        return especieEjemplar;
    }
    public void setEspecieEjemplar(Especie especieEjemplar) {
        this.especieEjemplar = especieEjemplar;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //
    
    //Constructores
    public Animal(){
        
    }
    /*public Animal(int id, Pais pais, Especie especie, int edad, double peso){
        this.idAnimal = id;
        this.paisOrigen = pais;
        this.especieEjemplar = especie;
        this.edad = edad;
        this.peso = peso;
    }*/
    //
    public TipoAlimentacion getTipoAlimentacion(){
        return tipoAlimentacion;
    }
    //Metodos
    public double calcularAlimento(){
        return 0;
    }
    //
}
