package LayeredArchitecture.dataAccess;

import LayeredArchitecture.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile Egitmen eklendi.."+instructor.getFirstName()+" "+instructor.getLastName());

    }
}
