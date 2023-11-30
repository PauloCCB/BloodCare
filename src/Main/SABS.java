package Main;

import Controlador.*;
import Vista.*;


public class SABS {
    public static void main(String[] args) {
        ControladorLogin controlador = new ControladorLogin(new frmLogin());
        controlador.iniciar();
    }
}
