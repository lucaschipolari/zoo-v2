package Modelo;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;

public class Sector {
    //Atributos
    private int numeroId;
    private double latitud;
    private double longitud;
    private int cantMax;
    private Color color;
    private ArrayList<Animal> animales =new ArrayList<>();
    private TipoAlimentacion tipoAlimentacion;
    private Empleado empleado;
    //
    
    //Getter y Setters
    public int getNumeroId() {
        return numeroId;
    }
    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }
    public double getLatitud() {
        return latitud;
    }
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public int getCantMax() {
        return cantMax;
    }
    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public ArrayList<Animal> getPoblacion() {
        return animales;
    }
    public void setPoblacion(ArrayList<Animal> animales) {
        this.animales = animales;
    }
    public Empleado getEncargado() {
        return empleado;
    }
    public void setEncargado(Empleado empleado) {
        this.empleado = empleado;
    }
    //
    
    //Constructores
    public Sector(){
        
    }/*
    public Sector(int numeroId, double latitud,double longitud, int cantMax){
        this.numeroId = numeroId;
        this.latitud = latitud;
        this.longitud = longitud;
        this.cantMax = cantMax;
        this.color = Color.GRIS;
        this.poblacion = new ArrayList();
    }
    */
    //
    //
    public Sector(int numero, double latitud, double longitud, int limite, TipoAlimentacion tipoAlimentacion, Empleado empleado) throws IllegalArgumentException {
        if(empleado == null) throw new IllegalArgumentException();
        this.numeroId = numero;
        this.latitud = latitud;
        this.longitud = longitud;
        this.cantMax = limite;
        this.tipoAlimentacion = tipoAlimentacion;
        this.empleado = empleado;
    }
    //
    
    //Métodos
  /*     public void actualizarColor(){
        Poblacion tipo = validarPoblacion();
        switch(tipo){
            case VACIO:
                this.color = Color.GRIS;
                break;
            case CARNIVOROS:
                this.color = Color.ROJO;
                break;
            case HERBIVOROS:
                this.color = Color.VERDE;
                break;
            case OTRO:
                break;
        }
    }
    
  public Poblacion validarPoblacion(){

        if(poblacion.isEmpty()){
           return Poblacion.VACIO; 
        }
        boolean contieneCarnivoros = false;
        boolean contieneHerviboros = false;
        
         for(Animal animalInstancia : poblacion){
              if (animalInstancia instanceof Carnivoro) {
                    contieneCarnivoros = true;
                } else if (animalInstancia instanceof Herbivoro){
                    contieneHerviboros = true;
                }
            }
        
        if(contieneCarnivoros && contieneHerviboros) return Poblacion.OTRO;
        else if (contieneCarnivoros) return Poblacion.CARNIVOROS;
        else if (contieneHerviboros) return Poblacion.HERBIVOROS;
        else return Poblacion.VACIO;
    }
    */
    public double calcularAlimentoSector(){
        double alimento = 0;
        for(Animal animal : animales){
            alimento += animal.calcularAlimento();
        }
        return alimento;
    }
    
    public void agregarAnimal(Animal animal)throws IllegalArgumentException, InvalidPropertiesFormatException{
         if(animal == null) throw new IllegalArgumentException();
        if(animal.getTipoAlimentacion() != this.tipoAlimentacion) throw new InvalidPropertiesFormatException("El sector no admite el animal");
        if(animales.size() == cantMax) throw new InvalidPropertiesFormatException("El sector no admite más animales");
            animales.add(animal);
    }
    
    public String nombrarAnimales() {
        String especies = "";
        for(Animal animal : animales){
            String ejemplarEspecie = animal.getEspecieEjemplar().getNombre(); 
            if(!especies.contains(ejemplarEspecie)){
                especies = especies.concat(ejemplarEspecie + ", ");
            }
        }
        if(especies.endsWith(", ")) {
            especies = especies.substring(0, especies.length() - 2);
        }
        return especies;
    }
    
    public String nombrarEncargado(){
        String nombraEncargado = "Sin Encargado";
        if(empleado!=null){
            nombraEncargado = empleado.getApellidos() + ", " + empleado.getNombres();
        }
        return nombraEncargado;
    }
    
    public String nombrarCoordenadas(){
        return "' " + Double.toString(latitud) + " , " + Double.toString(longitud) + " '";
    }
    
    public String nombrarSector(){
        return Integer.toString(numeroId);
    }
    
    public boolean hayEspacio(){
        return animales.size() < cantMax;
    }
    //

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
