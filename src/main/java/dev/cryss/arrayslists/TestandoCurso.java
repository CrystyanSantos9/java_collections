package dev.cryss.arrayslists;

import dev.cryss.models.Aula;
import dev.cryss.models.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoCurso {
    public static void main(String[] args) {
        Curso javaCursoColecoes = new Curso ("Dominando collections", "Paulo");

        javaCursoColecoes.adiciona (new Aula ("Revisando Arrays List", 21));
        javaCursoColecoes.adiciona (new Aula ("Acelerando Arrays List", 15));
        javaCursoColecoes.adiciona (new Aula ("Avuando Arrays List", 15));
        javaCursoColecoes.adiciona (new Aula ("Vegeta Arrays List", 30));
        javaCursoColecoes.adiciona (new Aula ("Zerando Arrays List", 1));

        List<Aula> aulasImutaveis = javaCursoColecoes.getAulas();
        List<Aula> aulasMutaveis = new ArrayList<> (aulasImutaveis);

        Collections.sort (aulasMutaveis);
        System.out.println (aulasMutaveis);
        System.out.println ("Tempo total aulas: "+ javaCursoColecoes.getTempoTotal ());

        System.out.println (javaCursoColecoes);
//        System.out.println (javaCursoColecoes.getAulas ());


    }
}
