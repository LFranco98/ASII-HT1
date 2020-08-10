
package www.AntiguaBurger.com.AntiguaBurger.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import www.AntiguaBurger.com.AntiguaBurger.Model.Cashier;
import www.AntiguaBurger.com.AntiguaBurger.Model.Conexion;
import www.AntiguaBurger.com.AntiguaBurger.Model.Foods;
import www.AntiguaBurger.com.AntiguaBurger.Model.IConexion;
import www.AntiguaBurger.com.AntiguaBurger.Model.IFoods;

@Controller
public class Control implements IOrderControl{

    @Override
    @GetMapping
    public String viewIndex(Model model) {
        model.addAttribute("cashier", new Cashier());
        return "index";
    }

    @Override
    @PostMapping("/desayunos")
    public String viewDesayuno(@ModelAttribute Cashier cashier, Model model) {
        model.addAttribute("cashier", cashier.getNombre());
        IConexion connect = new Conexion();
        IFoods comida = new Foods();
        for(int i=1;i<=3;i++){
            comida = connect.QueryFoods("desayuno"+i);
            model.addAttribute("combo"+i, comida.getNombre_combo());
            model.addAttribute("precio"+i, comida.getPrecio());
        }
        model.addAttribute("cashier1", new Cashier());
        model.addAttribute("opcion", new String());
        return "desayunos";
    }

    @Override
    @PostMapping("/almuerzos")
    public String viewAlmuerzo(@ModelAttribute Cashier cashier, Model model) {
        model.addAttribute("cashier", cashier.getNombre());
        IConexion connect = new Conexion();
        IFoods comida = new Foods();
        for(int i=1;i<=2;i++){
            comida = connect.QueryFoods("almuerzo"+i);
            model.addAttribute("combo"+i, comida.getNombre_combo());
            model.addAttribute("precio"+i, comida.getPrecio());
        }
        model.addAttribute("cashier1", new Cashier());
        model.addAttribute("opcion", new String());
        return "almuerzos";
    }

    @Override
    @PostMapping("/Cenas")
    public String viewCena(@ModelAttribute Cashier cashier, Model model) {
        model.addAttribute("cashier", cashier.getNombre());
        IConexion connect = new Conexion();
        IFoods comida = new Foods();
            comida = connect.QueryFoods("cena1");
            model.addAttribute("combo", comida.getNombre_combo());
            model.addAttribute("precio", comida.getPrecio());
        model.addAttribute("cashier1", new Cashier());
        model.addAttribute("opcion", new String());
        return "almuerzos";
    }
    
}
