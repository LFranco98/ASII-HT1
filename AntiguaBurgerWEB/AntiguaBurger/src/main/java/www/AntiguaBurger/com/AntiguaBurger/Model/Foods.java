package www.AntiguaBurger.com.AntiguaBurger.Model;

import java.util.List;

public class Foods implements IFoods{
    private String nombre_combo;
    private List<String> elementos;
    private int precio;
    
    @Override
    public String getNombre_combo() {
        return nombre_combo;
    }
    @Override
    public void setNombre_combo(String nombre_combo) {
        this.nombre_combo = nombre_combo;
    }
    @Override
    public List<String> getElementos() {
        return elementos;
    }
    @Override
    public void setElementos(List<String> elementos) {
        this.elementos = elementos;
    }
    @Override
    public int getPrecio() {
        return precio;
    }
    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
}
