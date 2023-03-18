package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entity.Student;
import repository.StudentRepository;

import java.util.List;

public class Query implements GraphQLRootResolver {
    private final StudentRepository strepo;

    public Query(StudentRepository strepo) {
        this.strepo = strepo;
    }

    public List<Student> returnAllStudents(){
        return strepo.getAllStudents();
    }
}
