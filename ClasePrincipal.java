/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ClasePrincipal {
    public static void main(String[] args){
        int opcion=EntradaSalida.pedirOpcion();
        while(opcion!=EntradaSalida.SALIR)
        {
            switch(opcion)
            {
                case EntradaSalida.INSERTAR:
                    //iNSEETAR
                    Alumno a=EntradaSalida.pedirDatosAlumno();
                    AccesoFichero.grabarAlumno(a);
                    break;
                case EntradaSalida.LISTAR:
                    //lISTA;
                   ArrayList<Alumno> lista_alumnos=AccesoFichero.devolverAlumnos();
                    break;
            }
             opcion=EntradaSalida.pedirOpcion();
        }
        
    }
            
}
