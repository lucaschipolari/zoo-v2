package Modelo;

import java.util.InvalidPropertiesFormatException;

public class Carnivoro extends Animal {
    private static double porcentajeExtra = 0.1;
    private static double pesoMaximo = 500;

    public Carnivoro(int edad, double peso, Pais origen, Especie especie, Sector sector) throws InvalidPropertiesFormatException {
        super(TipoAlimentacion.CARNIVORO, edad, peso, origen, especie, sector);
    }

    public static void setPorcentajeExtra(double porcentajeExtra){
        Carnivoro.porcentajeExtra = porcentajeExtra;
    }

    public static void setPesoMaximo(double pesoMaximo){
        Carnivoro.pesoMaximo = pesoMaximo;
    }

    public double getPorcentajeExtra() {
        return porcentajeExtra;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public double getPorcentajeExtraASumar(){
        return 1 + (peso > pesoMaximo ? porcentajeExtra : 0);
    }
    @Override
    public double calcularCantidadDeComida() {
        return peso * especie.getPorcentajePesoCarnivoro() * getPorcentajeExtraASumar();
    }
}
/*
public class Carnivoro extends Animal{
    //Atributos
    private double porcentualAlimento;
    private double alimentoDiario;
    //
    
    //Getter y Setters
    public double getPorcentualAlimento() {
        return porcentualAlimento;
    }
    public void setPorcentualAlimento(double porcentualAlimento) {
        this.porcentualAlimento = porcentualAlimento;
    }
    public double getAlimentoDiario() {
        this.alimentoDiario = calcularAlimento();
        return alimentoDiario;
    }
    public void setAlimentoDiario(double alimentoDiario) {
        this.alimentoDiario = alimentoDiario;
    }
    //
    
    //Constructores
    public Carnivoro(){
        
    }
    public Carnivoro(int id, Pais pais, Especie especie, int edad, double peso, double porcentual){
        super(id, pais, especie, edad, peso);
        this.porcentualAlimento = porcentual;
    }
    //
    
    //Métodos
    @Override
    public double calcularAlimento(){
        double totalAlim = this.getPeso() * porcentualAlimento;
        if(this.getPeso() > 500) { totalAlim = (totalAlim * 1.1); }
        return totalAlim;
    }
    //
}
*/