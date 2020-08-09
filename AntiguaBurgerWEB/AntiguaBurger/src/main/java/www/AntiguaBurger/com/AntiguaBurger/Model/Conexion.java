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
        switch(combo){
            case "desayuno1":{
                comida.setNombre_combo("Desayuno 1");
                elementos.add("Huevos");
                elementos.add("Frijoles");
                elementos.add("Plátanos");
                elementos.add("Pan");
                elementos.add("Bebida");
                comida.setPrecio(25);
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
    public Alternativas QueryAltern(String alternativa) {
        Alternativas altern = new Alternativas();
        List<String> elementos = new ArrayList<String>();
        switch(alternativa){
            case "Huevos":{
                altern.setAlternativa_inic("Huevos");
                elementos.add("Estrellados");
                elementos.add("Revueltos");
                elementos.add("Omellette");
                break;
            }
            case "Frijoles":{
                altern.setAlternativa_inic("Frijoles");
                elementos.add("Parados");
                elementos.add("Volteados");
                break;
            }
            case "Plátanos":{
                altern.setAlternativa_inic("Plátanos");
                elementos.add("Fritos");
                elementos.add("Cocidos");
                break;
            }
            case "Pan":{
                altern.setAlternativa_inic("Pan");
                elementos.add("Blanco");
                elementos.add("Integral");
                break;
            }
            case "Bebida_desayuno_cena":{
                altern.setAlternativa_inic("Bebida");
                elementos.add("Café");
                elementos.add("Té");
                elementos.add("Jugo");
                break;
            }
            case "Papas":{
                altern.setAlternativa_inic("Papas");
                elementos.add("Fritas");
                elementos.add("Al vapor");
                elementos.add("Horneadas");
                break;
            }
            case "Ensalada":{
                altern.setAlternativa_inic("Ensalada");
                elementos.add("Verde");
                elementos.add("César");
                elementos.add("Asiática");
                break;
            }
            case "Pollo":{
                altern.setAlternativa_inic("Pollo");
                elementos.add("Frito");
                elementos.add("A la parrilla");
                break;
            }
            case "Bebida_almuerzo":{
                altern.setAlternativa_inic("Bebida");
                elementos.add("Gaseosa");
                elementos.add("Té frío");
                elementos.add("Agua pura");
                break;
            }
            case "Sopa":{
                altern.setAlternativa_inic("Sopa");
                elementos.add("Tomate");
                elementos.add("Frijol");
                break;
            }
            case "Postre":{
                altern.setAlternativa_inic("Postre");
                elementos.add("Helado");
                elementos.add("Pastel");
                elementos.add("Flan");
                elementos.add("Gelatina");
                break;
            }
            default:{
                altern.setAlternativa_inic("NO_CURRENT_SELECT");
            }
        }
        altern.setElem_altern(elementos);
        return altern;
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
        extra.setExtra(matrz);
        
        
        return extra;
    }
    
}
