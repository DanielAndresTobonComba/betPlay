package com.betplay.View.ViewRoles;

import java.lang.ModuleLayer.Controller;

public class GuiaRoles {

    private GuiaRoles() {}

    public static void entrarVista(String rol, String nombreUsuario) {
        switch (rol) {
            case "Aficionado":
                Aficionado.startAficionado();
                break;

            case "Arbitro":
                Arbitro.startArbitro(nombreUsuario);
                break;

            case "Medico":
                Medico.startMedico(nombreUsuario);
                break;
            
            case "Periodista":
                Periodista.startPeriodista(nombreUsuario);
                break;
            
            case "Tecnico":
                Tecnico.startTecnico(nombreUsuario);
                break;
                

            default:
                Administrador.startAdmin();
                break;
        }
    }

}
