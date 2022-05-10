/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airportadmin;

/**
 *
 * @author ZeroCool
 */

public class Airport {
    private String name;
    private Aeroplane[] aviones; 

    public Airport(String name) {
        this.name = name;
        this.aviones = new Aeroplane[5];
        this.createAeroplanes();
    }
    
    private void createAeroplanes(){
        for (int i = 0; i < this.aviones.length; i++){
            this.aviones[i] = new Aeroplane();
        }
    }
    
    public void listIds(){
        for (int i = 0; i < this.aviones.length; i++){
            System.out.println(i+1+") ID: "+this.aviones[i].getAeroplaneId());
        }
    }
    
    
    public int cantTotalPasajeros(){
        int i,x;
        x = 0;
        for (i = 0; i < this.aviones.length; i++){
            x = x + this.aviones[i].getPactual();
        }
        return x;
    }
    
    
    public int cantTotalDisponible(){
        int i,x;
        x = 0;
        for (i = 0; i< this.aviones.length; i++){
            x = x + (this.aviones[i].getCmax() - this.aviones[i].getPactual());
        }
        return x;
    }
    
    public String searchAeroplane(int aeroplaneId){
        String x;
        x = "ID no encontrado";
        for (int i = 0; i < this.aviones.length; i++){
            if (this.aviones[i].getAeroplaneId() == aeroplaneId){
                x = "";
                x += "ID: " + this.aviones[i].getAeroplaneId();
                x += "\n";
                x += "Estado del avion: " + this.aviones[i].isStatus();
                x += "\n";
                x += "Capacidad Maxima: " + this.aviones[i].getCmax();
                x += "\n";
                x += "Pasajeros a bordo: " + this.aviones[i].getPactual();
                x += "\n";
                break;
            }
        } 
        return x;
    }
    
    public String subirPasajeros(int aeroplaneId, int subirP){
        String x;
        x = "ID no encontrado";
        for (int i = 0; i < this.aviones.length; i++){
            if (this.aviones[i].getAeroplaneId() == aeroplaneId){
                this.aviones[i].subirPasajeros(subirP);
                x = "";
                break;
            }
        }
        return x;
    }
    
    public String bajarPasajeros(int aeroplaneId, int bajarP){
        String x;
        x = "ID no encontrado";
        for (int i = 0; i < this.aviones.length; i++){
            if (this.aviones[i].getAeroplaneId() == aeroplaneId){
                this.aviones[i].bajarPasajeros(bajarP);
                x = "";
                break;
            }
        }
        return x;
    }
    
    
    
}
