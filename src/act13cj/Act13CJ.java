/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act13cj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author alexm
 */
public class Act13CJ {

interface ListaTamaño {
    String[] Lista = new String[]{
            "Malcom Prado",
            "Brandon Davila",
            "Juan Perez",
            "Francisco Perez",
            "Alejandra Gonzalez",
            "Ana Gonzalez",
            "Laura Rebolledo",
            "Samuel Santos",
            "Susana horia",
            "Elbis tec"
    };


    static List<String> List(List lista, int size) {

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            lista.add(Lista[rand.nextInt(Lista.length)]);

        }
        return lista;
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<String> lista =  new ArrayList<>();

        //Alfabetica
        Comparator<String> alfabetica= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.charAt(0), o2.charAt(0));
            }
        };

        //Longitud
        Comparator<String> longitud = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        //Orden alfabetica con lambda
        Comparator<String> alfabeticaLambda = (String o1, String o2)
                -> Integer.compare(o1.charAt(0), o2.charAt(0));

        //Tamaño lambda
        Comparator<String> tamañoLambda = (String o1, String o2)
                -> Integer.compare(o1.length(), o2.length());

        //Metodo de referencia alfabetico
        Comparator<String> referenciaAlfa = alfabetica::compare;

        //Metodo de referencia tamaño
        Comparator<String> refereneciaTam = longitud::compare;

        //Ordenamiento anonima alfabetico
        System.out.println("Ordenamiento anonima alfabetico");
        ListaTamaño.List(lista,10);
        System.out.println("Sin ordenar: \n" + lista);
        lista.sort(alfabetica);
        System.out.println("Ordenada: \n" + lista + "\n");
        lista.clear();

        //Ordenamiento anonima tamaño
        System.out.println("Ordenamiento anonima tamaño");
        ListaTamaño.List(lista,10);
        System.out.println("Sin ordenar: \n" + lista);
        lista.sort(longitud);
        System.out.println("Ordenada: \n" + lista +"\n");
        lista.clear();

        //Ordenamiento Lambda alfabetico
        System.out.println("Ordenamiento Lambda alfabetico");
        ListaTamaño.List(lista,10);
        System.out.println("Sin ordenar: \n" + lista);
        lista.sort(alfabeticaLambda);
        System.out.println("Ordenada: \n" + lista +"\n");
        lista.clear();

        //Ordenamiento Lambda tamaño
        System.out.println("Ordenamiento Lambda tamaño");
        ListaTamaño.List(lista,10);
        System.out.println("Sin ordenar: \n" + lista);
        lista.sort(tamañoLambda);
        System.out.println("Ordenada: \n" + lista + "\n");
        lista.clear();

        //Ordenamiento Metodo de referencia alfabetico
        System.out.println("Ordenamiento Metodo de referencia alfabetico");
        ListaTamaño.List(lista,10);
        System.out.println("Sin ordenar: \n" + lista);
        lista.sort(referenciaAlfa);
        System.out.println("Ordenada: \n" + lista +"\n");
        lista.clear();

        //Ordenamiento Metodo de referencia tamaño
        System.out.println("Ordenamiento Metodo de referencia tamaño");
        ListaTamaño.List(lista,10);
        System.out.println("Sin ordenar: \n" + lista);
        lista.sort(refereneciaTam);
        System.out.println("Ordenada: \n" + lista + "\n");
        lista.clear();
    }
    }
    

