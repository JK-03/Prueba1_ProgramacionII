/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_programacionii;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class BlockBuster {
    private ArrayList<BlockBusterItem> listaItems;
    
    public BlockBuster() {
        listaItems = new ArrayList<>();
    }
    
    public BlockBusterItem buscarItem(int codigo, String tipo) {
        return buscarItem(codigo, tipo, 0);
    }
    
    private BlockBusterItem buscarItem(int codigo, String tipo, int index) {
        if (index < listaItems.size()) {
            BlockBusterItem item = listaItems.get(index);
            if (item.getCodigo() == codigo && ((tipo.equalsIgnoreCase("MOVIE") && item instanceof MovieItem) || (tipo.equalsIgnoreCase("GAME") && item instanceof VideoGameItem))) {
                return item;
            }
            return buscarItem(codigo, tipo, index + 1);
        }
        return null;
    }
    
    public BlockBusterItem agregarItem(int codigo, String nombre, String tipoItem) {
        if (buscarItem(codigo, tipoItem) == null) {
            if (tipoItem.equalsIgnoreCase("MOVIE")) {
                MovieItem movieItem = new MovieItem(codigo, nombre, 0);
                listaItems.add(movieItem);
                return movieItem;
            } else if (tipoItem.equalsIgnoreCase("GAME")) {
                String consola = "";
                VideoGameItem gameItem = new VideoGameItem(codigo, nombre, consola);
                listaItems.add(gameItem);
                return gameItem;
            }
        }
        return null;
    }
    
    public BlockBusterItem rentar(int codigo, String tipoItem, int dias) {
        if (buscarItem(codigo, tipoItem) != null) {
            BlockBusterItem item = buscarItem(codigo, tipoItem);
            return item;
        }
        return null;
    }
    
    public String auditarMovieEstados() {
        return auditarMovieEstados(new StringBuilder(), 0);
    }
    
    private String auditarMovieEstados(StringBuilder moviesInfo, int index) {
        if (index < listaItems.size()) {
            BlockBusterItem item = listaItems.get(index);
            
            if (item instanceof MovieItem) {
                MovieItem movie = (MovieItem) item;
                moviesInfo.append(movie.toString()).append("\n\n");
            }
            return auditarMovieEstados(moviesInfo, index + 1);
        }
        return moviesInfo.toString();
    }
    
    
    
}