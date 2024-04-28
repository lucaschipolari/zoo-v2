package Principal;

import Controlador.ControladorSectores;
import Datos.Repositorio;
import java.util.InvalidPropertiesFormatException;

public class Main {


    public static void main(String[] args) throws InvalidPropertiesFormatException {
        Repositorio newRepo = new Repositorio();
        Repositorio.inicializar();
        ControladorSectores control = new ControladorSectores(newRepo);
        control.iniciar();
    }
    
}
