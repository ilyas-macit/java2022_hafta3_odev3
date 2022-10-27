package dataAccess.concretes;

import dataAccess.abstracts.InstructorDal;
import entities.concretes.Instructor;

public class HibernateInstructorDal implements InstructorDal {
    @Override
    public void add(Instructor instructor) {
        System.out.println("hibernate ile kaydedildi");
    }
}
