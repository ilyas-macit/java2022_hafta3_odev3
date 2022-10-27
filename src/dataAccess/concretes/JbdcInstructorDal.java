package dataAccess.concretes;

import dataAccess.abstracts.InstructorDal;
import entities.concretes.Instructor;

public class JbdcInstructorDal implements InstructorDal {
    @Override
    public void add(Instructor instructor) {
        System.out.println("jbdc ile kaydedildi");
    }
}
