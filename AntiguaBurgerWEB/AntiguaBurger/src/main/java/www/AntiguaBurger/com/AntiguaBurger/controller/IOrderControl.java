package www.AntiguaBurger.com.AntiguaBurger.controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import www.AntiguaBurger.com.AntiguaBurger.Model.Cashier;

public interface IOrderControl {
    public String viewIndex(Model model);
    public String viewDesayuno(Cashier cashier, Model model);
    public String viewAlmuerzo(Cashier cashier, Model model);
    public String viewCena(Cashier cashier, Model model);
}
