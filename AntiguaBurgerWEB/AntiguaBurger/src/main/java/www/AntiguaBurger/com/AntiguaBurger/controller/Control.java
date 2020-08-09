
package www.AntiguaBurger.com.AntiguaBurger.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import www.AntiguaBurger.com.AntiguaBurger.Model.Cashier;

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
        return "desayunos";
    }

    @Override
    @GetMapping("/desayunos")
    public String viewDesayuno(Model model) {
        model.addAttribute("cashier", new Cashier());
        return "desayunos";
    }

  
    
}
