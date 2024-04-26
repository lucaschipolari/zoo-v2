package Controlador;

import java.awt.event.ActionListener;

public interface IControlador extends ActionListener{
    public void iniciar();
    public void terminado(String accion);
}
