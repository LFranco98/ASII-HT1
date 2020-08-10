/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.AntiguaBurger.com.AntiguaBurger.Model;

import java.util.List;

/**
 *
 * @author Danielmced
 */
public interface IFoods {
    public String getNombre_combo();
    public void setNombre_combo(String nombre_combo);
    public List<String> getElementos();
    public void setElementos(List<String> elementos);
    public int getPrecio();
    public void setPrecio(int precio);
}
