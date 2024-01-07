package dev.cryss.arrayslists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1="Conhecendo mais";
        String aula2="Modelando aula";
        String aula3="Trabalhando com sets";
        String aula4="Agora entendendo";
        String aula5="Chateado";

        ArrayList<String> aulas = new ArrayList<> ();

        aulas.add (aula1);
        aulas.add (aula2);
        aulas.add (aula3);
        aulas.add (aula4);
        aulas.add (aula5);

        System.out.println (aulas);

        aulas.remove (0);

        System.out.println (aulas);

        for(String aula: aulas){
            System.out.println ("Aula: " + aula);
        }

        String primeiraAula = aulas.get (0);

        System.out.println ("A primeira aula: " + primeiraAula);

        for(int i=0; i < aulas.size (); i++){
            System.out.println ("aula: " + aulas.get (i));
        }

        aulas.forEach (aula -> System.out.println ("percorrendo " + aula));
        aulas.forEach (System.out::println);

        Collections.sort (aulas);

        aulas.forEach (aula -> System.out.println ("percorrendo " + aula));


        Collections.sort (aulas);

    }
}
