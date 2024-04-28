package Controlador;

import Datos.Repositorio;
import Vista.VistaSectores;
import java.awt.event.ActionEvent;

public class ControladorSectores implements IControlador {
    
    private VistaSectores vista;
    private Repositorio repo;
    
    public ControladorSectores(Repositorio repo){
        this.repo = repo;
    }
    
    @Override
    public void iniciar(){
        vista = new VistaSectores();
        vista.asignarControlador(this);
        vista.representarSectores(repo.getSectores(), this);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(vista.AGREGAR_ANIMAL)) {
            
            ControladorAgregarAnimal controlAgregar = new ControladorAgregarAnimal(repo, this);
            controlAgregar.iniciar();
            
        } else if(e.getActionCommand().equals(vista.CALCULAR_ALIMENTO)){
            vista.representarAlimento(repo.getSectores());
        }
        else if(e.getActionCommand().contains(vista.DETALLAR_SECTOR)){
            ControladorDetalleSector controlDetalle = new ControladorDetalleSector(repo.consultarSector(e.getActionCommand().replace("detallarSector","")), this);
            //ControladorDetalleSector controlDetalle = new ControladorDetalleSector(repo.getSector(e.getID()), this);
            controlDetalle.iniciar();
            
        }
    }

    @Override
    public void terminado(String accion) {
        if(accion.equals("aceptarClick")){
            vista.representarSectores(repo.getSectores(), this);
        }
    }
}
