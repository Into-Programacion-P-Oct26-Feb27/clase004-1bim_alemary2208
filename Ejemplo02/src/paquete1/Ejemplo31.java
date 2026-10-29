/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        double notaAsignatura1;
        double notaAsignatura2;
        String nombreEstudiante;
        int añoNacimiento;
        String ciudadNacimento;
        int edadActual;
        
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = entrada.nextLine();
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = entrada.nextDouble();
        
        
        System.out.println("Ingrese nombre de asignatura 2");
        nombreAsignatura2 = entrada.nextLine();
        System.out.println("Ingrese nota de asignatura 2");
        notaAsignatura2 = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.println("Ingrese nombre de estudiante");
        nombreEstudiante = entrada.nextLine();
        
        System.out.println("Ingrese ciudad de nacimiento");
        ciudadNacimento = entrada.nextLine();
        
        
        System.out.println("Año de nacimiento");
        añoNacimiento = entrada.nextInt();
        
        edadActual = 2026 - añoNacimiento;
        /* se necesita empezar el año de nacimiento (entrada.nextLine)
        y se necesita la ciudad de nacimieto
        */
        
        System.out.printf("Asignatura 1:%s\nNota1:%.2f\n" + "Asignatura 2:%s\nNota 2:%.2f\n" +
                "Nombre de estudiante: %s\n" + "Ciudad de nacimiento: %s\n" + "Año de nacimiento %s\n" +
                "Edad Actual %s\n",
                nombreAsignatura1,
                notaAsignatura1,
                nombreAsignatura2,
                notaAsignatura2,
                nombreEstudiante,
                ciudadNacimento,
                añoNacimiento,
                edadActual);
                
   
    }
    
}
