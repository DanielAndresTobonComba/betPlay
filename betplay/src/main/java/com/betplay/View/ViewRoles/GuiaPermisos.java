package com.betplay.View.ViewRoles;

import java.util.List;

import com.betplay.Controller;
import com.betplay.View.viewSecundarias.PermisosArbitro;
import com.betplay.View.viewSecundarias.PermisosMedico;
import com.betplay.View.viewSecundarias.PermisosPeriodista;
import com.betplay.View.viewSecundarias.PermisosTecnico;

public class GuiaPermisos {

    private GuiaPermisos() {}

    public static boolean menuPermisos(String nombreUsuario, List<Integer> listaPermisos) {
        //List<Integer> permisosDenegados = Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados;
        String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
        boolean salida = false;
        switch (rol) {
            case "Tecnico":
                salida =PermisosTecnico.Permisos(listaPermisos, nombreUsuario);
                break;
            
            case "Periodista":
                salida = PermisosPeriodista.Permisos(listaPermisos, nombreUsuario);
                break;
            
            case "Medico":
                salida = PermisosMedico.Permisos(listaPermisos, nombreUsuario);
                break;
        
            default:
                salida = PermisosArbitro.Permisos(listaPermisos, nombreUsuario);
                break;
        }
        return salida;
    }

}
