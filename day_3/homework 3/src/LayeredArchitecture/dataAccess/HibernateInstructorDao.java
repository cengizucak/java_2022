package LayeredArchitecture.dataAccess;

import LayeredArchitecture.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("HiberNate ile Egitmen eklendi.." + instructor.getFirstName()+" "+instructor.getLastName());

    }
}
