package Datos;

import Modelo.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.*;

public class Repositorio {
    
    
    private static ArrayList<Animal> animales = new ArrayList<>();
    private static ArrayList<Sector> sectores = new ArrayList<>();
    private static ArrayList<Pais> paises = new ArrayList<>();
    private static ArrayList<Especie> especies = new ArrayList<>();

    //Contenedores de datos
   /* private ArrayList<Sector> sectores;
    private ArrayList<Empleado> empleados;
    private ArrayList<Especie> especies;
    private ArrayList<Pais> paises;
    
*///
    
    //Carga de datos iniciales
        
      private static void inicializarPaises(){
        paises.add(new Pais("Congo",784));
        Pais madagascar = new Pais("Madagascar",800);
        paises.add(madagascar);
        Pais china = new Pais("China",505);
        paises.add(china);
        Pais argentina = new Pais("Argentina",604);
        paises.add(argentina);
        Pais chile = new Pais("Chile",261);
        paises.add(chile);
        Pais bolivia = new Pais("Bolivia",113);
        paises.add(bolivia);       
    }
        private static void inicializarEspecies() {
        especies.add(new Especie("León", TipoAlimentacion.CARNIVORO, 0.7));
        especies.add(new Especie("Jirafa", TipoAlimentacion.HERBIVORO, 0));
        especies.add(new Especie("Tigre", TipoAlimentacion.CARNIVORO, 0.5));
        especies.add(new Especie("Rinoceronte", TipoAlimentacion.HERBIVORO, 0));
    }
    
        
       private static void inicializarSectores() {

        Empleado empleadoUno = new Empleado(18524615,"Dross","Rotzank","Calle Siete 1248");
        Empleado empleadoDos = new Empleado(41376419,"Isaac","Clarke","Ishimura D6, Apt.32");
        Empleado empleadoTres = new Empleado(43562883,"John","Shepard","Av.Normandía 983");
        Empleado empleadoCuatro = new Empleado(43562883,"John","Shepard","Av.Normandía 983");


       sectores.add(new Sector(1, -26.250724, -65.522827, 10, TipoAlimentacion.HERBIVORO, empleadoUno));
        sectores.add(new Sector(2, -26.252359, -65.521511, 10, TipoAlimentacion.CARNIVORO, empleadoDos));
        sectores.add(new Sector(3, -26.254661, -65.522726, 10, TipoAlimentacion.HERBIVORO, empleadoTres));
        sectores.add(new Sector(4, -26.257250, -65.523514, 10, TipoAlimentacion.CARNIVORO, empleadoCuatro));
        
    }
    public static void inicializar (){
        inicializarSectores();
        inicializarEspecies();
        inicializarPaises ();
    }
    
    //
    
    //Getter y Setters
    public ArrayList<Sector> getSectores() {
        return sectores;
    }
    public void setSectores(ArrayList<Sector> sectores) {
        this.sectores = sectores;
    }
    public ArrayList<Especie> getEspecies() {
        return especies;
    }
    public void setEspecies(ArrayList<Especie> especies) {
        this.especies = especies;
    }
    public ArrayList<Pais> getPaises() {
        return paises;
    }
    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }
    //
    public static Pais getPais(int codigoIso){
        return  paises.stream()
                .filter(p-> p.getCodigoIso() == codigoIso)
                .findFirst()
                .orElseThrow();
    }

    public static Especie getEspecie(String nombre){
        return especies.stream()
                .filter(e-> e.getNombre().equals(nombre))
                .findFirst()
                .orElseThrow();
    }

    public static Sector getSector(int numero){
        return  sectores.stream()
                .filter(s-> s.getNumeroId() == numero)
                .findFirst()
                .orElseThrow();
    }

    public static void agregarAnimal(Animal animal){
        animales.add(animal);
    }

    public static double getTotalComida(TipoAlimentacion tipoAlimentacion){
        return  animales.stream()
                .filter(a-> tipoAlimentacion.equals(a.getTipoAlimentacion()))
                .mapToDouble(a-> a.calcularCantidadDeComida())
                .sum();
    }

    public static List<Especie> getEspeciesPorTipoAlimentacion(TipoAlimentacion tipoAlimentacion){
        return especies.stream()
                .filter(e-> e.getTipoAlimentacion().equals(tipoAlimentacion))
                .toList();
    }
    public static List<Sector> getSectoresPorTipoAlimentacion(TipoAlimentacion tipoAlimentacion){
        return sectores.stream()
                .filter(s-> s.getTipoAlimentacion().equals(tipoAlimentacion))
                .toList();
    }
    

    //Métodos
    /*
    public void iniciaAgregarAnimal(ArrayList<Object> datos){
            for(Sector sec : sectores){
                if(sec.nombrarSector().equals(datos.get(6))){
                    Especie esp = getEspecie((String) datos.get(0));
                    Pais ps = getPais(4);
                    int edad = Integer.parseInt((String) datos.get(2));
                    double peso = Double.parseDouble((String) datos.get(3));
                    double extra = Double.parseDouble((String) datos.get(4));
                    TipoAlimentacion tipo = (TipoAlimentacion) datos.get(5);
                    
                    Animal animal;
                    /*switch(tipo){
                        case CARNIVORO:
                            animal = new Animal(totalAnimales()+1,
                                                      ps, esp, edad, peso, extra/100);
                            break;
                        case HERBIVORO:
                            animal = new Herbivoro(totalAnimales()+1,
                                                      ps, esp, edad, peso, extra);
                            break;
                        default:
                            animal = null;
                            break;
                    }
                 //   sec.agregarAnimal(animal);
            }
        }
    }
*/
    /*
    public Especie consultarEspecie(String especie){
        for(Especie esp : especies){
            if(esp.getDenominacion().equals(especie)) return esp;
        }
        Especie nuevaEspecie = new Especie(especie);
        especies.add(nuevaEspecie);
        return nuevaEspecie;
    }
    public Pais consultarPais(String pais){
        for(Pais p : paises){
            if(p.getNombrePais().equals(pais)) return p;
        }
        Pais nuevoPais = new Pais(pais);
        paises.add(nuevoPais);
        return nuevoPais;
    }
    public Sector consultarSector(String id){
        for(Sector s : sectores){
            if(Integer.toString(s.getNumeroId()).equals(id)){
                return s;
            }
        }
        return null;
    }
    */
    public int totalCarnivoros(){
        int carnivoros = 0;
        for(Sector sec : sectores){
            if(sec.getTipoAlimentacion()== TipoAlimentacion.CARNIVORO) carnivoros += sec.getPoblacion().size();
        }
        return carnivoros;
    }
    
    public int totalHerbivoros(){
        int herbivoros = 0;
        for(Sector sec : sectores){
            if(sec.getTipoAlimentacion()== TipoAlimentacion.HERBIVORO) herbivoros += sec.getPoblacion().size();
        }
        return herbivoros;
    }
    public int totalAnimales(){
        return totalCarnivoros() + totalHerbivoros();
    }

    //
}
