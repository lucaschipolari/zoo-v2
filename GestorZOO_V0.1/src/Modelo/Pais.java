package Modelo;

public class Pais {
    private String nombre;
    private int codigoIso;

    public Pais(String nombre, int codigoIso) {
        this.nombre = nombre;
        this.codigoIso = codigoIso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoIso() {
        return codigoIso;
    }
    @Override
    public String toString(){
        return nombre;
    }
}
