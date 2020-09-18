package www.AntiguaBurger.com.AntiguaBurger.Model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Conexion implements IConexion{

    @Override
    public Foods QueryFoods(String combo) {
    Foods comida = new Foods();
    List<String> elementos = new ArrayList<String>();
    List<Alternativas> alternativas = new ArrayList<Alternativas>();
    Alternativas alt = new Alternativas();
    
    
        switch(combo){
            case "desayuno1":{
                comida.setNombre_combo("Desayuno 1");
                elementos.add("Huevos");
                elementos.add("Frijoles");
                elementos.add("Plátanos");
                elementos.add("Pan");
                elementos.add("Bebida");
                comida.setPrecio(25);
                alt.setAlternativa_base("Huevos");
                alternativas.add(alt);
                alt.setAlternativa_base("Frijoles");
                alternativas.add(alt);
                alt.setAlternativa_base("Plátanos");
                alternativas.add(alt);
                alt.setAlternativa_base("Pan");
                alternativas.add(alt);
                alt.setAlternativa_base("Bebida");
                alternativas.add(alt);
                break;
            }
            case "desayuno2":{
                comida.setNombre_combo("Desayuno 2");
                elementos.add("Cereal");
                elementos.add("Fruta");
                elementos.add("Bebida");
                comida.setPrecio(18);
                break;
            }
            case "desayuno3":{
                comida.setNombre_combo("Desayuno 3");
                elementos.add("Avena");
                elementos.add("Fruta");
                elementos.add("Bebida");
                comida.setPrecio(20);
                break;
            }
            case "almuerzo1":{
                comida.setNombre_combo("Almuerzo 1");
                elementos.add("Hamburguesa");
                elementos.add("Papas");
                elementos.add("Bebida");
                elementos.add("Postre");
                comida.setPrecio(30);
                break;
            }
            case "almuerzo2":{
                comida.setNombre_combo("Almuerzo 2");
                elementos.add("Ensalada");
                elementos.add("Pollo");
                elementos.add("Sopa");
                elementos.add("Bebida");
                comida.setPrecio(35);
                break;
            }
            case "cena1":{
                comida.setNombre_combo("Cena 1");
                elementos.add("Huevos");
                elementos.add("Frijoles");
                elementos.add("Tortillas");
                elementos.add("Bebida");
                comida.setPrecio(28);
                break;
            }
            default:{
                comida.setNombre_combo("NO_CURRENT_SELECT");
            }
        }
        comida.setElementos(elementos);
    return comida;
    }

    

    @Override
    public Extras QueryExtras(String tiempo) {
        Extras extra = new Extras();
        String matrz[][] = new String[2][];
    
        switch(tiempo){
            case "Deasayuno_Cena":{
                matrz[0][0]="Huevo";matrz[1][0]="1";
                matrz[0][1]="Frijoles";matrz[1][1]="4";
                matrz[0][2]="Plátanos";matrz[1][2]="4";
                matrz[0][3]="Crema";matrz[1][3]="2";
                matrz[0][4]="Queso";matrz[1][4]="2";
                matrz[0][5]="Pan";matrz[1][5]="4";
                matrz[0][6]="Tortillas";matrz[1][6]="5";
                matrz[0][7]="Fruta";matrz[1][7]="8";
                matrz[0][8]="Jugo de naranja";matrz[1][8]="6";
                break;            
            }
            case "Almuerzo":{
                matrz[0][0]="Torta de carne";matrz[1][0]="10";
                matrz[0][1]="Queso amarillo";matrz[1][1]="6";
                matrz[0][2]="Helado";matrz[1][2]="7";
                matrz[0][3]="Pastel";matrz[1][3]="10";
                matrz[0][4]="Flan";matrz[1][4]="8";
                matrz[0][5]="Gelatina";matrz[1][5]="3";
                break;
            }
            default:{
                }
        }
        return extra;
    }

    @Override
    public List<Alternativas> QueryAltern(String combo) {        
        List<Alternativas> alternativas = new ArrayList<Alternativas>();
        Alternativas alt = new Alternativas();    
    
        switch(combo){
            case "desayuno1":{
                alt.setAlternativa_base("Huevos");
                alternativas.add(alt);
                alt.setAlternativa_base("Frijoles");
                alternativas.add(alt);
                alt.setAlternativa_base("Plátanos");
                alternativas.add(alt);
                alt.setAlternativa_base("Pan");
                alternativas.add(alt);
                alt.setAlternativa_base("Bebida");
                alternativas.add(alt);
                break;
            }
            case "desayuno2":{
                alt.setAlternativa_base("Bebida");
                alternativas.add(alt);
                break;
            }
            case "desayuno3":{
                alt.setAlternativa_base("Bebida");
                alternativas.add(alt);
                break;
            }
            case "almuerzo1":{
                alt.setAlternativa_base("Papas");
                alternativas.add(alt);
                alt.setAlternativa_base("Bebida");
                alternativas.add(alt);
                alt.setAlternativa_base("Postre");
                alternativas.add(alt);
                break;
            }
            case "almuerzo2":{
                alt.setAlternativa_base("Ensalada");
                alternativas.add(alt);
                alt.setAlternativa_base("Pollo");
                alternativas.add(alt);
                alt.setAlternativa_base("Sopa");
                alternativas.add(alt);
                alt.setAlternativa_base("Bebida");
                alternativas.add(alt);
                break;
            }
            case "cena1":{
                alt.setAlternativa_base("Huevos");
                alternativas.add(alt);
                alt.setAlternativa_base("Frijoles");
                alternativas.add(alt);
                alt.setAlternativa_base("Bebida");
                alternativas.add(alt);
                break;
            }
            default:{
                alt.setAlternativa_base("NO_CURRENT_SELECT");
                break;
            }
        }
    return alternativas;
    }
    
}
