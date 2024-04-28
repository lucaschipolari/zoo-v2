package Modelo;

import java.util.InvalidPropertiesFormatException;

public class Herbivoro extends Animal{
    private static double porcentajePeso = 2;
    private double valorFijo;

    public Herbivoro(int edad, double peso, Pais origen, Especie especie, Sector sector, double valorFijo) throws InvalidPropertiesFormatException {
        super(TipoAlimentacion.HERBIVORO, edad, peso, origen, especie, sector);
        this.valorFijo = valorFijo;
    }

    public static void setPorcentajePeso(double porcentajePeso){
        Herbivoro.porcentajePeso = porcentajePeso;
    }

    public static double getPorcentajePeso() {
        return porcentajePeso;
    }

    public double getValorFijo() {
        return valorFijo;
    }
    @Override
    public double calcularAlimento(){
        return peso * porcentajePeso + valorFijo;
    }
    @Override
    public double calcularCantidadDeComida() {
        return peso * porcentajePeso + valorFijo;
    }
}

/*
public class Herbivoro extends Animal {
    //Atributos
    private double baseAlimento;
    private double alimentoDiario;
    //
    
    //Getter y Setters
    public double getBaseAlimento() {
        return baseAlimento;
    }
    public void setBaseAlimento(double baseAlimento) {
        this.baseAlimento = baseAlimento;
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
    public Herbivoro(){
        
    }
    public Herbivoro(int id, Pais pais, Especie especie, int edad, double peso, double baseAlimento){
        super(id, pais, especie, edad, peso);
        this.baseAlimento = baseAlimento;
    }
    //
    
    //Métodos
    @Override
    public double calcularAlimento(){
        return this.getPeso() * 2 + baseAlimento;
    }
    //
}
*/