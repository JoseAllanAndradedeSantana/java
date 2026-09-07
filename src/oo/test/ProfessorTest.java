package oo.test;

import oo.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "José Allan";
        professor.idade = 36;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome +" Idade: " + professor.idade +" Sexo: "+professor.sexo);
    }
}
