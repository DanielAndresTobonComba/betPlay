package com.betplay.View.ViewRoles;

import java.lang.ModuleLayer.Controller;

public class GuiaRoles {

    private GuiaRoles() {}

    public static void entrarVista(String rol) {
        switch (rol) {
            case "Aficionado":
                Aficionado.startAficionado();
                break;

            case "Arbitro":
                Arbitro.startArbitro();
                break;

            case "Medico":
                Medico.startMedico();
                break;
            
            case "Periodista":
                Periodista.startPeriodista();
                break;
            
            case "Tecnico":
                Tecnico.startTecnico();
                break;
                

            default:
                Administrador.startAdmin();
                break;
        }
    }

}
