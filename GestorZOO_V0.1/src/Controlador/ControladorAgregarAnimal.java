package Controlador;

import Datos.Repositorio;
import Modelo.Sector;
import Modelo.TipoAlimentacion;
import Vista.VistaAgregarAnimal;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import Modelo.*;
import Vista.VistaSectores;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorAgregarAnimal implements IControlador {

    private VistaAgregarAnimal vista;
    private VistaSectores vistaS;
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
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(vista.RADIO_CARNIVORO)) {
            vista.carnivoroSeleccionado();
            List<Sector> myList = repo.getSectoresPorTipoAlimentacion(TipoAlimentacion.CARNIVORO);
            ArrayList<Sector> miArrayList = new ArrayList<>(myList);
            vista.cargarSectores(miArrayList);
            
        } else if (e.getActionCommand().equals(vista.RADIO_HERBIVORO)) {
            vista.herbivoroSeleccionado();
            List<Sector> myList = repo.getSectoresPorTipoAlimentacion(TipoAlimentacion.HERBIVORO);
            ArrayList<Sector> miArrayList = new ArrayList<>(myList);
            for(Sector sec : miArrayList){
                System.out.println(sec.getNumeroId());
            }
            vista.cargarSectores(miArrayList);
        } else if (e.getActionCommand().equals(vista.VOLVER)) {
            vista.volverSeleccionado();
        } else if (e.getActionCommand().equals(vista.ACEPTAR)) {
            try {
                vista.aceptarSeleccionado();
            } catch (InvalidPropertiesFormatException ex) {
                Logger.getLogger(ControladorAgregarAnimal.class.getName()).log(Level.SEVERE, null, ex);
            }
                
//                repo.iniciaAgregarAnimal(vista.aceptarSeleccionado());
//                vista.volverSeleccionado();
//                padre.terminado(vista.ACEPTAR);
//                
        }
        
    }

    @Override
    public void terminado(String accion) {
        
    }
}
