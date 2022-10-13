package LayeredArchitecture.business;

import LayeredArchitecture.dataAccess.InstructorDao;
import LayeredArchitecture.entities.Instructor;

public class InstructurManager {

    private InstructorDao instructorDao;

    public InstructurManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    public void add(Instructor instructor) {

        instructorDao.add(instructor);
    }


}
