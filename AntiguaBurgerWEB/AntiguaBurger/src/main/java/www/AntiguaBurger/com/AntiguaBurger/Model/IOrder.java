package www.AntiguaBurger.com.AntiguaBurger.Model;

import java.util.Date;
import java.util.List;

public interface IOrder {
    public Cashier getCashier();
    public void setCashier(Cashier cashier);
    public int getNumeroorden();
    public void setNumeroorden(int numeroorden);
    public Date getFecha();
    public void setFecha(Date fecha);
    public Cliente getCliente();
    public void setCliente(Cliente cliente);
    public Foods getCombo();
    public void setCombo(Foods combo);
    public List<Alternativas> getAlternativas();
    public void setAlternativas(List<Alternativas> alternativas);
    public List<Extras> getExtras();
    public void setExtras(List<Extras> extras);
    public float getTotal();
    public void setTotal(float total);
}
