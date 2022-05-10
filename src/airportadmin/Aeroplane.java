/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airportadmin;
import java.util.Random;

/**
 *
 * @author ZeroCool
 */

public class Aeroplane {
    private static int count = 0;
    private int aeroplaneId;
    private int cmax;
    private int pactual;
    private boolean status;
    
    public Aeroplane() {
        Random cantidad =new Random();
        this.count = ++count;
        this.aeroplaneId = this.count;
        this.cmax = cantidad.nextInt(50,250);
        Random cantidad2 =new Random();
        this.pactual = cantidad2.nextInt(this.cmax);
        this.status = true;
    }
    
    public Aeroplane(int capacidadMax, int pasajerosActuales) { 
        this.count = ++count;
        this.aeroplaneId = this.count;
        this.cmax = capacidadMax;
        this.pactual = pasajerosActuales;
        this.status = true;
    }
    
    
    
    /* Getters */
    public int getAeroplaneId() {
        return aeroplaneId;
    }

    public int getCmax() {
        return cmax;
    }

    public int getPactual() {
        return pactual;
    }

    public boolean isStatus() {
        return status;
    }
    
    

    /* Setters */
    public void setAeroplaneId(int aeroplaneId) {
        this.aeroplaneId = aeroplaneId;
    }

    public void setCmax(int cmax) {
        this.cmax = cmax;
    }

    public void setPactual(int pactual) {
        this.pactual = pactual;
    }
    
    
    public void bajarPasajeros(int bajarPas){
       
        if (this.pactual >= bajarPas && bajarPas > 0){
            this.pactual = this.pactual - bajarPas;
            System.out.println("La cantidad de pasajeros ha sido actualizada: "+this.pactual+"/"+this.cmax);
        }else{
            System.out.println("La cantidad de pasajeros a bajar es mayor a la que existe actualmente en el avión");
        }          
    }
    
    public void subirPasajeros(int subirPas){
       
        if (this.cmax >= (subirPas + this.pactual) && subirPas > 0){
            this.pactual = this.pactual + subirPas;
            System.out.println("La cantidad de pasajeros ha sido actualizada: "+this.pactual+"/"+this.cmax);
        }else{
            System.out.println("La cantidad de pasajeros a subir es mayor a la capacidad máxima del avión");
        }          
    }
    
}


