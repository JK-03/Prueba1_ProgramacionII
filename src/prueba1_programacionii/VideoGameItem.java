/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_programacionii;

/**
 *
 * @author jenniferbueso
 */
public class VideoGameItem extends BlockBusterItem{
    private String consolaNombre;
    public final static String PLAYSTATION = "PLAYSTATION", XBOX = "XBOX", WII = "WII";

    public VideoGameItem(int codigo, String nombre, String consolaNombre) {
        super(codigo, nombre, 30);
        this.consolaNombre = consolaNombre;
    }
    
    public String toString() {
        return super.toString() + " - Game";
    }
    
    public double pagoRenta(int dias) {
        return dias * rentaItem;
    }

    public String getConsolaNombre() {
        return consolaNombre;
    }

    public void setConsolaNombre(String consolaNombre) {
        this.consolaNombre = consolaNombre;
    }

    public double getRentaItem() {
        return rentaItem;
    }

    public void setRentaItem(double rentaItem) {
        this.rentaItem = rentaItem;
    }
}
