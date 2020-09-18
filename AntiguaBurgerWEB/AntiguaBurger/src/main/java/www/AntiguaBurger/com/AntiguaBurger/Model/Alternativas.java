package www.AntiguaBurger.com.AntiguaBurger.Model;
import java.util.List;

public class Alternativas implements IAlternativas{
    private String alternativa_base;
    private String alternativa_escogida;

    @Override
    public String getAlternativa_base() {
        return alternativa_base;
    }

    @Override
    public void setAlternativa_base(String alternativa_base) {
        this.alternativa_base = alternativa_base;
    }

    @Override
    public String getAlternativa_escogida() {
        return alternativa_escogida;
    }

    @Override
    public void setAlternativa_escogida(String alternativa_escogida) {
        this.alternativa_escogida = alternativa_escogida;
    }
    
}
