/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.ficheros;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class EntradaSalida {
    static final int SALIR=8;
    static final int INSERTAR=1;
    static final int LISTAR=2;

    static Alumno pedirDatosAlumno() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre del alumno:");
        String nombre=sc.nextLine();
        System.out.println("Apellido del alumno:");
        String apellido=sc.nextLine();
        System.out.println("Edad del alumno:");
        int edad=sc.nextInt();
        Alumno a=new Alumno(nombre, apellido, edad);
        return a;
    }
    static int pedirOpcion() {
        Scanner sc=new Scanner(System.in);
        System.out.println(INSERTAR+"-Insertar alumno");
        
        System.out.println(LISTAR+"-Listar alumnos");
        
        System.out.println(SALIR+"-Salir:");
     
        int opcion=sc.nextInt();
        
        return opcion;
    }
    
}
