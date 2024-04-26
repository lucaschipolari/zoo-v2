package Principal;

import Controlador.ControladorSectores;
import Datos.Repositorio;

public class Main {


    public static void main(String[] args) {
        Repositorio newRepo = new Repositorio();
        Repositorio.inicializar();
        ControladorSectores control = new ControladorSectores(newRepo);
        control.iniciar();
    }
    
}
