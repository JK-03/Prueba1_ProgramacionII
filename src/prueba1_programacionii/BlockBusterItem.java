/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_programacionii;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author jenniferbueso
 */
public abstract class BlockBusterItem {
    private int codigo;
    private String nombre;
    protected double rentaItem;
    protected Calendar fechaItem;
    
    public BlockBusterItem(int codigo, String nombre, double rentaItem) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rentaItem = rentaItem;
        fechaItem = Calendar.getInstance();
    }
    
    public String toString() {
        return "Código: " + codigo + "\nNombre: " + nombre + "\nRenta: Lps. " + rentaItem;
    }
    
    public abstract double pagoRenta(int dias);

    public int getCodigo() {
        return codigo;
    }
}
