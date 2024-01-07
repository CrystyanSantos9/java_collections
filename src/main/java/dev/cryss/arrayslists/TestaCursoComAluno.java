package dev.cryss.arrayslists;

import dev.cryss.models.Aluno;
import dev.cryss.models.Aula;
import dev.cryss.models.Curso;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaCursoColecoes = new Curso ("Dominando collections", "Paulo");

        javaCursoColecoes.adiciona (new Aula ("Revisando Arrays List", 21));
        javaCursoColecoes.adiciona (new Aula ("Acelerando Arrays List", 15));
        javaCursoColecoes.adiciona (new Aula ("Avuando Arrays List", 15));
        javaCursoColecoes.adiciona (new Aula ("Vegeta Arrays List", 30));
        javaCursoColecoes.adiciona (new Aula ("Zerando Arrays List", 1));

        Aluno a1 = new Aluno ("Zeferino",14);
        Aluno a2 = new Aluno ("Fabio", 52);
        Aluno a3 = new Aluno ("Rodrigo Turini", 54);

        javaCursoColecoes.matricula(a1);
        javaCursoColecoes.matricula(a2);
        javaCursoColecoes.matricula(a3);

        Aluno turine = new Aluno ("Rodrigo Turini", 54);

//        System.out.println (javaCursoColecoes.getAlunos ());
        System.out.println ("O Aluno " + turine + " está matriculado?");
        System.out.println (javaCursoColecoes.estaMatriculado(turine));
        System.out.println (a3.equals (turine));





    }
}
