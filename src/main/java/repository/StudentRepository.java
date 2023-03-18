package repository;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private final List<Student> students ;

    public StudentRepository() {
        this.students = new ArrayList<>();
        students.add(new Student("010101", "foulenfoulen", "foulenfoulen@gmail.com"));
        students.add(new Student("010102", "foulenfoulen2", "foulenfoulen2@gmail.com"));
    }

    public List<Student> getAllStudents(){
        return students;
    }


}
