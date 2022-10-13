package LayeredArchitecture.business;


import LayeredArchitecture.core.logging.Logger;
import LayeredArchitecture.dataAccess.CourseDao;
import LayeredArchitecture.dataAccess.HibernateCourseDao;
import LayeredArchitecture.dataAccess.JdbcCourseDao;
import LayeredArchitecture.entities.Course;

import java.util.Objects;

public class CourseManager {

    private CourseDao courseDao;


    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public CourseManager() {
    }



    public void add(Course course) throws Exception {

       if (course.getUnitPrice() < 0) {
            throw new Exception("Kursun fiyati 0 dan kucuk olamaz");

        }

        courseDao.add(course);


    }
}
