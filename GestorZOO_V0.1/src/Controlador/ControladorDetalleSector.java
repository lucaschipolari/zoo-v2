package Controlador;

import Modelo.Sector;
import Vista.VistaDetalleSector;
import java.awt.event.ActionEvent;

public class ControladorDetalleSector implements IControlador {
    
    private VistaDetalleSector vista;
    private Sector detallaSector;
    private IControlador padre;

    public ControladorDetalleSector(Sector detallaSector, IControlador padre){
        this.detallaSector = detallaSector;
        this.padre = padre;
    }
    
    @Override
    public void iniciar() {
        vista = new VistaDetalleSector();
        vista.asignarControlador(this);
        //vista.cargarSector(detallaSector);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(vista.VOLVER)) {
            vista.volverSeleccionado();
        }
    }
    
    @Override
    public void terminado(String accion) {
        
    }
}
