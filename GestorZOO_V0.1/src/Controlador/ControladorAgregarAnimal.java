package Controlador;

import Datos.Repositorio;
import Modelo.Sector;
import Modelo.TipoAlimentacion;
import Vista.VistaAgregarAnimal;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class ControladorAgregarAnimal implements IControlador {

    private VistaAgregarAnimal vista;
    private Repositorio repo;
    private IControlador padre;
    
    public ControladorAgregarAnimal(Repositorio repo, IControlador padre){
        this.repo = repo;
        this.padre = padre;
    }
    
    @Override
    public void iniciar() {
        vista = new VistaAgregarAnimal();
        vista.asignarControlador(this);
        vista.cargarSectores(repo.getSectores());
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(vista.RADIO_CARNIVORO)) {
            vista.carnivoroSeleccionado();
            List<Sector> myList = repo.getSectoresPorTipoAlimentacion(TipoAlimentacion.CARNIVORO);
            ArrayList<Sector> miArrayList = new ArrayList<>(myList);
            System.out.println(miArrayList);
            vista.cargarSectores(miArrayList);
            System.out.println("Controlador.ControladorAgregarAnimal.actionPerformed()");        
        } else if (e.getActionCommand().equals(vista.RADIO_HERBIVORO)) {
            vista.herbivoroSeleccionado();
            List<Sector> myList = repo.getSectoresPorTipoAlimentacion(TipoAlimentacion.HERBIVORO);
            ArrayList<Sector> miArrayList = new ArrayList<>(myList);
            System.out.println(miArrayList);
            vista.cargarSectores(repo.getSectores());
        } else if (e.getActionCommand().equals(vista.VOLVER)) {
            vista.volverSeleccionado();
        } else if (e.getActionCommand().equals(vista.ACEPTAR)) {
/*
            repo.iniciaAgregarAnimal(vista.aceptarSeleccionado());
            vista.volverSeleccionado();
            padre.terminado(vista.ACEPTAR);
*/
        }
    }

    @Override
    public void terminado(String accion) {
        
    }
}
