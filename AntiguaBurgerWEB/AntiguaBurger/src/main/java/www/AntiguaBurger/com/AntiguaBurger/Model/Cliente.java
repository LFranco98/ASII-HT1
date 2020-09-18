package www.AntiguaBurger.com.AntiguaBurger.Model;

public class Cliente implements ICliente{
    private String nombre;
    private String nit;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNit() {
        return nit;
    }

    @Override
    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
}
