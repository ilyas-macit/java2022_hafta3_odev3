package business.abstracts;

import entities.concretes.Instructor;

public interface InstructorService {
    void add(Instructor instructor) throws Exception;
}
