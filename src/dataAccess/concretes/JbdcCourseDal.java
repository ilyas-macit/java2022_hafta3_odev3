package dataAccess.concretes;

import dataAccess.abstracts.CourseDal;
import entities.concretes.Course;

import java.util.List;

public class JbdcCourseDal implements CourseDal {

    @Override
    public void Add(Course course) {
        System.out.println("jbdc'ye kaydedildi");
    }

}
