package business.abstracts;

import entities.concretes.Course;

import java.util.List;

public interface CourseService {
    void Add(Course course) throws Exception;
}
