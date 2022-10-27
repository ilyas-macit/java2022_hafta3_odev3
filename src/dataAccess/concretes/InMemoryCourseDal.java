package dataAccess.concretes;

import dataAccess.abstracts.CourseDal;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCourseDal implements CourseDal {




    @Override
    public void Add(Course course) {
        System.out.println("Memorye kaydedildi");
    }
}
