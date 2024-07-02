package com.betplay.View.ViewRoles;

import java.util.List;

import com.betplay.Controller;
import com.betplay.View.viewSecundarias.PermisosPeriodista;
import com.betplay.View.viewSecundarias.PermisosTecnico;

public class GuiaPermisos {

    private GuiaPermisos() {}

    public static void menuPermisos(String rol, String nombreUsuario) {
        List<Integer> permisosDenegados = Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados;
        switch (rol) {
            case "Tecnico":
                PermisosTecnico.Permisos(permisosDenegados);
                break;
            
            case "Periodista":
                PermisosPeriodista.Permisos(permisosDenegados);
                break;
            
            case "Medico":
                
                break;
        
            default:
                break;
        }
    }

}
