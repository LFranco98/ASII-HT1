
package www.AntiguaBurger.com.AntiguaBurger.controller;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import www.AntiguaBurger.com.AntiguaBurger.Model.Alternativas;
import www.AntiguaBurger.com.AntiguaBurger.Model.Cashier;
import www.AntiguaBurger.com.AntiguaBurger.Model.Conexion;
import www.AntiguaBurger.com.AntiguaBurger.Model.Foods;
import www.AntiguaBurger.com.AntiguaBurger.Model.IConexion;
import www.AntiguaBurger.com.AntiguaBurger.Model.IFoods;
import www.AntiguaBurger.com.AntiguaBurger.Model.IOrder;
import www.AntiguaBurger.com.AntiguaBurger.Model.Opcion;
import www.AntiguaBurger.com.AntiguaBurger.Model.Order;

@Controller
public class Control{

    IOrder orden;
    int ordernumber=0;
    
    @GetMapping("/")
    public String viewIndex(Model model) {
        model.addAttribute("cashier", new Cashier());
        return "index";
    }
    
    @PostMapping("/menus")
    public String viewMenus(@ModelAttribute Cashier cashier, Model model){
        try{
            orden = new Order();
            ordernumber++;
            cashier.setNombre(cashier.getUsername());
            orden.setCashier(cashier);            
            orden.setNumeroorden(ordernumber);
            orden.setFecha(new Date());
            model.addAttribute("exception","");
        }catch(Exception ex){
            model.addAttribute("exception","Ups.. Ha sucedido un error inesperado: " + ex.getMessage());
        }finally{return "menus";}
    }


    @GetMapping("/desayunos")
    public String viewDesayuno(Model model) {
        model.addAttribute("cashier", orden.getCashier().getNombre());
        model.addAttribute("opciondes", new Opcion());
        
        return "desayunos";
    }

    @PostMapping("/opt_desayunos")
    public String viewOptDesayuno(@ModelAttribute Opcion opcion, Model model){
        IConexion cn = new Conexion();
        orden.setCombo(cn.QueryFoods(opcion.getOpcion()));
        orden.setAlternativas(cn.QueryAltern(opcion.getOpcion()));
        model.addAttribute("combo", orden.getCombo().getNombre_combo());
        model.addAttribute("alt", new Alternativas());
        model.addAttribute("alternativasAorden", orden);
        model.addAttribute("opcion", new Opcion());
        Alternativas alt;
        //alt.setAlternativa_base("dfklaj");
        //orden.setAlternativas(alt);
        
        return "opt_desayunos";
    }

    @GetMapping("/almuerzos")
    public String viewAlmuerzo(Model model) {
        model.addAttribute("cashier", orden.getCashier().getNombre());
        model.addAttribute("opcionalm", new Opcion());
        return "almuerzos";
    }


    @GetMapping("/cenas")
    public String viewCena(Model model) {
        model.addAttribute("cashier", orden.getCashier().getNombre());
        model.addAttribute("opciondes", new Opcion());
        return "cenas";
    }
    
}
