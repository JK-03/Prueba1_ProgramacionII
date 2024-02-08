/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_programacionii;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jenniferbueso
 */
public class MovieItem extends BlockBusterItem{
    private String estado;
    
    public MovieItem(int codigo, String nombre, double rentaItem) {
        super(codigo, nombre, rentaItem);
        estado = "ESTRENO";
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEstado: " + estado + " - Movie";
    }
    
    public double pagoRenta(int dias) {
        double total = rentaItem;
        if (estado.equals("ESTRENO") && dias > 2) {
            total += (dias - 2) * 50;
        } else if (estado.equals("NORMAL") && dias > 5) {
            total += (dias - 5) * 30;
        }
        return total;
    }
    
    public void evaluarEstado() {
        Calendar hoy = Calendar.getInstance();
        hoy.add(Calendar.MONTH, -5);
        if (estado.equals("ESTRENO") && fechaItem.before(hoy)) {
            estado = "NORMAL";
        }
    }

    public double getRentaItem() {
        return rentaItem;
    }

    public void setRentaItem(double rentaItem) {
        this.rentaItem = rentaItem;
    }
}
