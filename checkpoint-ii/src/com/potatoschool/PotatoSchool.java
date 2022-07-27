package com.potatoschool;

import java.util.ArrayList;
import java.util.List;

public class PotatoSchool {
    private List<Professor> listaProfessores = new ArrayList<Professor>();

    private void adicionarProfessor(Professor professor){
        listaProfessores.add(professor);
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }
}
