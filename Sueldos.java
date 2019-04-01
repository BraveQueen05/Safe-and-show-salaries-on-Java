/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Sueldos {
    
    private Scanner teclado = new Scanner(System.in);
    private float sueldo[];
    private float suma=0;
    
    public void IngresaSueldos(){        
        sueldo=new float[10];
        
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println("Ingresar "+i+" sueldo:");
            sueldo[i]=teclado.nextFloat();
            // también solamente puede ser así aquí: suma+=sueldo[i]; 
        } 
        
        System.out.println("Sueldos ingresados: "+Arrays.toString(sueldo));
    }
    
    public void Suma(){
        for (int i = 1; i < sueldo.length; i++) {
            suma += sueldo[i];
        }
        System.out.println("La suma es: "+suma);
    }
}
