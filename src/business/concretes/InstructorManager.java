package business.concretes;

import business.abstracts.InstructorService;
import core.logging.Logger;
import dataAccess.abstracts.InstructorDal;
import entities.concretes.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager implements InstructorService {
    List<Logger> loggers;
    List<Instructor> instructors;
    InstructorDal instructorDal;

    public InstructorManager(List<Logger> loggers, InstructorDal instructorDal) {
        this.loggers = loggers;
        this.instructorDal = instructorDal;
        instructors = new ArrayList<>();
        instructors.add(new Instructor(0, "Engin Demirog"));
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        for (Instructor instructor1 : instructors){
            if (instructor1.getName() == instructor.getName()){
                throw new Exception("Ayni isimden iki egitmen olamaz");
            }

            instructorDal.add(instructor);
            for (Logger logger : loggers){
                logger.log(instructor.getName());
            }
        }
    }
}
