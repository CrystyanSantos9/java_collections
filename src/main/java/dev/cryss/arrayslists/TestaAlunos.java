package dev.cryss.arrayslists;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<> ();
        alunos.add ("Rodrigo");
        alunos.add ("Alberto");
        alunos.add ("Paulo");
        alunos.add ("Alessandro");
        alunos.add ("Gustavo");
        alunos.add ("Gustavo");

        boolean henriqueEstaMatriculado = alunos.contains ("Henrique");
        System.out.println (henriqueEstaMatriculado);

        for (String aluno: alunos) {
            System.out.println (aluno);
        }

        System.out.println (alunos.size ());
    }
}
