/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psl;
import com.google.gson.Gson;
import java.util.Date;
import java.util.List;
/**
 *
 * @author DELL
 */
public class tablita {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return Costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.Costo = costo;
    }
    private String nombre;
    private String producto;
    private int Costo;

 public tablita deserializar (String json) {
tablita tablita = new tablita ();
try { 
   tablita = new Gson() .fromJson(json, tablita.class);

} catch (Exception ex){
         System.err.print("Ocurrio un error: " + ex.getMessage());

} 
  return tablita;
 }
}
