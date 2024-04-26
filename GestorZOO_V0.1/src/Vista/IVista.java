package Vista;

import Utilidades.Mensaje;
import Controlador.IControlador;

    public interface IVista
    {
        void asignarControlador(IControlador control);
        void MostrarComoDialogo();
        void MostrarMensaje(String mensaje, Mensaje tipo);
        boolean MostrarConfirmacion(String mensaje);
    }
