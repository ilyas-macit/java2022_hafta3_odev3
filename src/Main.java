import business.concretes.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.concretes.InMemoryCourseDal;
import dataAccess.concretes.JbdcCourseDal;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course = new Course(0,0,0,1,"java kursu");
        List<Logger> loggers = List.of(new MailLogger(), new DatabaseLogger(), new FileLogger());
        CourseManager courseManager = new CourseManager(new JbdcCourseDal(), loggers);

        courseManager.Add(course);
    }
}