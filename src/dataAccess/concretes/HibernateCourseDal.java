package dataAccess.concretes;

import dataAccess.abstracts.CourseDal;
import entities.concretes.Course;

import java.util.List;

public class HibernateCourseDal implements CourseDal {




    @Override
    public void Add(Course course) {
        System.out.println("hiber nate kaydedildi");
    }
}
