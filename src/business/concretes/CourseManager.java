package business.concretes;

import business.abstracts.CourseService;
import core.logging.Logger;
import dataAccess.abstracts.CourseDal;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements CourseService {
    CourseDal courseDal;
    List<Logger> loggers;
    List<Course> courses;

    public CourseManager(CourseDal courseDal , List<Logger> loggers) {
        this.courseDal = courseDal;
        this.loggers = loggers;
        courses =new ArrayList<>();
        courses.add(new Course(1,0,0,100,"Java ile Programlama"));
        courses.add(new Course(2,0,0,200,"C# İle Programlama"));
        courses.add(new Course(3,0,0,0,"İleri Seviye Java"));
        courses.add(new Course(4,0,0,40,"İle Programlama"));


    }

    @Override
    public void Add(Course course) throws Exception{

        if(course.getPrice() < 0){
            throw new Exception("kursun fiyati 0 dan kucuk olamaz");
        }
        for(Course course1: courses){
            if(course1.getName() == course.getName()){
                throw new Exception("ayni adda iki kurs olamaz");
            }
        }
        courseDal.Add(course);
        for (Logger logger : loggers){
            logger.log(course.getName());
        }


    }

}
