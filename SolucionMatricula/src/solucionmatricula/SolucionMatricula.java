/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionmatricula;
import porcentajes.*;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class SolucionMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se declaran e inicializan las variables. 
        int costomatricula = 1330;
        boolean bandera;
        boolean bandera1;
        String lugar;
        int edad;
        String estadocivil;
        String estadoCasado = "Casado";
        int cargasfamiliares;
        double descuento;
        double descuentototal;
        double costofinal;
        double porcentajeTramite;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la ciudad de procedencia.");
        lugar = entrada.next();
        bandera = (lugar.equals("Loja") || lugar.equals("Zamora"));
        
        if (bandera = true){
            descuento = costomatricula * porcentajes.porcentajeLugar;
            descuentototal = descuento;
            descuento = 0;
        }else{
            descuentototal = 0;
        }
        System.out.println("Ingrese su edad.");
        edad = entrada.nextInt();
        if (edad >= 17 && edad<20) {
            descuento = costomatricula * porcentajes.porcentajeEdad;
            descuentototal = descuentototal + descuento;
            descuento = 0;
        
        System.out.println("Ingrese su estado civil.");
        estadocivil = entrada.next();
        bandera1 = (estadocivil.equals("Casado"));
        
        if (bandera = true){
            descuento = costomatricula * porcentajes.porcentajeEstadoCivil;
            descuentototal = descuentototal + descuento;
            descuento = 0;
        }else{
            descuentototal = 0;
        }    
         System.out.println("Enumere si posee alguna carga familiar(hijos).");
         cargasfamiliares = entrada.nextInt();
         if (cargasfamiliares > 0) {
            descuento = costomatricula * porcentajes.porcentajeCargasFamiliares;
            descuentototal = descuentototal + descuento;
            descuento = 0;
         }
        }
        porcentajeTramite = costomatricula * porcentajes.porcentajeTramites;
        descuentototal = descuentototal - porcentajeTramite;
        costofinal = costomatricula - descuentototal;
        System.out.printf ("El descuento total que usted recibe seria de %.1f"
                + "y el costo final a pagar por su matricula seria %.1f"
                , descuentototal, costofinal);
    }
}
