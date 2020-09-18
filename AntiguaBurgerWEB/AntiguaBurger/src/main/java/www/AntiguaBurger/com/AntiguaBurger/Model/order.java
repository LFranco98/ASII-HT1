/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.AntiguaBurger.com.AntiguaBurger.Model;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Danielmced
 */
public class Order implements IOrder{
    private Cashier cashier;
    private int numeroorden;
    private Date fecha;
    private Cliente cliente;
    private Foods combo;
    private List<Alternativas> alternativas;
    private List<Extras> extras;
    private float total;

    @Override
    public Cashier getCashier() {
        return cashier;
    }

    @Override
    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    @Override
    public int getNumeroorden() {
        return numeroorden;
    }

    @Override
    public void setNumeroorden(int numeroorden) {
        this.numeroorden = numeroorden;
    }

    @Override
    public Date getFecha() {
        return fecha;
    }

    @Override
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public Foods getCombo() {
        return combo;
    }

    @Override
    public void setCombo(Foods combo) {
        this.combo = combo;
    }

    @Override
    public List<Alternativas> getAlternativas() {
        return alternativas;
    }

    @Override
    public void setAlternativas(List<Alternativas> alternativas) {
        this.alternativas = alternativas;
    }

    @Override
    public List<Extras> getExtras() {
        return extras;
    }

    @Override
    public void setExtras(List<Extras> extras) {
        this.extras = extras;
    }

    @Override
    public float getTotal() {
        return total;
    }

    @Override
    public void setTotal(float total) {
        this.total = total;
    }
    
    
    
}
