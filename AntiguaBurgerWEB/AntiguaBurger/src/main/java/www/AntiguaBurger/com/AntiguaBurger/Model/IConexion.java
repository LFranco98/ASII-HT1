/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.AntiguaBurger.com.AntiguaBurger.Model;

import java.util.List;

/**
 *
 * @author Danielmced
 */
public interface IConexion {
    public Foods QueryFoods(String combo);
    public List<Alternativas> QueryAltern(String combo);
    public Extras QueryExtras(String tiempo);
    
}
