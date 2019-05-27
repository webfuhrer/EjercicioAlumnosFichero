/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
class AccesoFichero {
static String ruta_fichero="D:\\fichero_alumnos.csv";
    static void grabarAlumno(Alumno a) {
       File f=new File(ruta_fichero);
    try {
        FileWriter escritor=new FileWriter(f, true);
        String linea=a.getNombre()+","+a.getApellido()+","+a.getEdad();
        escritor.write(linea);
        escritor.write("\n");
        escritor.close();
    } catch (IOException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
   static ArrayList<Alumno> devolverAlumnos()
   {
       ArrayList<Alumno> lista_alumnos=new ArrayList<>();
    try {
        FileReader lector=new FileReader(ruta_fichero);
        BufferedReader br=new BufferedReader(lector);
      
       String linea= br.readLine();
        while(linea!=null)
       {
        System.out.println(linea);
        
        String[] datos_alumno=linea.split(",");
        Alumno a=new Alumno(datos_alumno[0],
                datos_alumno[1], Integer.parseInt(datos_alumno[2]));
        lista_alumnos.add(a);
        linea= br.readLine();
       }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
    }
    return lista_alumnos;
   }
}
