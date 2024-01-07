package dev.cryss.arrayslists;

import dev.cryss.models.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula ("Revisando Arrays List", 21);
        Aula a2 = new Aula ("Lista de objetos", 15);
        Aula a3 = new Aula ("Relacionamento de listas e objeto", 15);


        ArrayList<Aula> aulas = new ArrayList<> ();
        aulas.add (a1);
        aulas.add (a2);
        aulas.add (a3);

        Collections.sort (aulas);
        Collections.sort (aulas, Comparator.comparingInt (Aula::getTempo));

        System.out.println (aulas);

        aulas.sort (Comparator.comparingInt (Aula::getTempo));

    }

}
