package com.example.university.repository;

import com.example.university.model.Course;
import com.example.university.model.Professor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

public interface ProfessorRepository {
    ArrayList<Professor> getProfessors();

    Professor getProfessorById(int professorId);

    Professor addProfessor(Professor professor);

    Professor updateProfessor(int professorId, Professor professor);

    void deleteProfessor(int professorId);

    Course getProfessorCourses(int professorId);
}