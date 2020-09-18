package www.AntiguaBurger.com.AntiguaBurger.Model;

public class Cashier implements ICashier{
    private String username;
    private String nombre;  

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }    
      
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
