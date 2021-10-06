/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author rataq
 */
public class TP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno lm = new Alumno(1001,"Lopez","Martin");
        Alumno mb = new Alumno(1002,"Martinez","Brenda");
        Alumno ao = new Alumno(1003, "Alaniz", "Olivia");
        Materia i1 = new Materia(001, "Ingles I", 01);
        Materia m1 = new Materia(002, "Matemáticas", 01);
        Materia l1 = new Materia(003, "Laboratorio 1", 01);
        Materia ed = new Materia(004, "Estructura de Datos",01);
        
        lm.agregarMateria(i1);
        lm.agregarMateria(m1);
        lm.agregarMateria(l1);
        mb.agregarMateria(i1);
        mb.agregarMateria(m1);
        mb.agregarMateria(l1);
        mb.agregarMateria(l1);
        ao.agregarMateria(ed);
        
        System.out.println(lm.apellido+" "+lm.nombre+"\nCantidad de Materias: "+lm.cantidadMaterias());
        for(Materia it: lm.materias){
            String mat=it.getNombre();
            System.out.println("· "+mat);
        }
        System.out.println("");
        System.out.println(mb.apellido+" "+mb.nombre+"\nCantidad de Materias: "+mb.cantidadMaterias());
        for(Materia it: mb.materias){
            String mat=it.getNombre();
            System.out.println("· "+mat);
        }
        System.out.println("");
        System.out.println(ao.apellido+" "+ao.nombre+"\nCantidad de Materias: "+ao.cantidadMaterias());
        for(Materia it: ao.materias){
            String mat=it.getNombre();
            System.out.println("· "+mat);
        }
        
    } 
}
