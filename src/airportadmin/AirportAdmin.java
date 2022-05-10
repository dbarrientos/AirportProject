/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airportadmin;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author ZeroCool
 */

public class AirportAdmin {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport("Arturo Merino Benitez");
        int menu=0, Id=0;
        boolean estado = true;
        
        
        do{
            boolean error;
            do{
                System.out.println("Seleccione una opcion valida: ");
                System.out.println("");
                System.out.println("1) Listar el ID de todos los aviones.");
                System.out.println("2) Cantidad total de pasajeros a bordo de los aviones.");
                System.out.println("3) Cantidad total de asientos disponibles en todos los aviones.");
                System.out.println("4) Buscar y mostrar datos de un avion por su ID.");
                System.out.println("5) Subir pasajeros a un avion.");
                System.out.println("6) Bajar pasajeros de un avion.");
                System.out.println("7) SALIR.");
                
                
                try{
                    menu = scanner.nextInt();
                    error = false;
                }catch(InputMismatchException e){
                    scanner.next();
                    System.out.println("Por Favor, ingrese un numero entero.");
                    System.out.println(" ");
                    error = true;
                }
              
            }while(error);
            
            switch (menu){
                case 1: {
                    System.out.println(" ");
                    airport.listIds();
                    System.out.println("\n");
                    break;
                }
                case 2: {
                    System.out.println("La cantidad total de pasajeros a bordo de los aviones es de: "+ airport.cantTotalPasajeros());
                    break;
                }
                case 3: {
                    System.out.println("La cantidad total de asientos disponibles es de: "+ airport.cantTotalDisponible());
                    break;
                }
                case 4: {
                    System.out.println("Ingrese el ID del avion:");
                    try{
                        Id = scanner.nextInt();
                    }catch(InputMismatchException e){
                        scanner.next();
                        System.out.println("Por favor, ingrese un ID valido.");
                    }
                    System.out.println(airport.searchAeroplane(Id));
                    break;
                }
                case 5: {
                    System.out.println("Ingrese el ID del avion:");
                    try{
                        Id = scanner.nextInt();
                    }catch(InputMismatchException e){
                        scanner.next();
                        System.out.println("Por favor, ingrese un ID valido.");
                    }
                    System.out.println("Ingrese cantidad de pasajeros por abordar");
                    int cantidadSubir = 0;
                    
                    try{
                        cantidadSubir = scanner.nextInt();
                    }catch(InputMismatchException e){
                        scanner.next();
                        System.out.println("Por favor, ingrese una cantidad valida.");
                    }
                    airport.subirPasajeros(Id, cantidadSubir);
                    break;
                }
                case 6: {
                    System.out.println("Ingrese el ID del avion:");
                    try{
                        Id = scanner.nextInt();
                    }catch(InputMismatchException e){
                        scanner.next();
                        System.out.println("Por favor, ingrese un ID valido.");
                    }
                    System.out.println("Ingrese cantidad de pasajeros por descender.");
                    int cantidadBajar = 0;
                    
                    try{
                        cantidadBajar = scanner.nextInt();
                    }catch(InputMismatchException e){
                        scanner.next();
                        System.out.println("Por favor, ingrese una cantidad valida.");
                    }
                    airport.bajarPasajeros(Id, cantidadBajar);
                    break;
                }
                case 7: {
                    estado = false;
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("La opcion no esta disponible");
                    break;
                }
            }
            
        }while(estado);
    }
    
}
