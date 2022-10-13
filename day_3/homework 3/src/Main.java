
import LayeredArchitecture.business.CatogoryManager;
import LayeredArchitecture.business.CourseManager;
import LayeredArchitecture.business.InstructurManager;
import LayeredArchitecture.core.logging.DatabaseLogger;
import LayeredArchitecture.core.logging.FileLogger;
import LayeredArchitecture.core.logging.Logger;
import LayeredArchitecture.core.logging.MailLogger;
import LayeredArchitecture.dataAccess.*;
import LayeredArchitecture.entities.Category;
import LayeredArchitecture.entities.Course;
import LayeredArchitecture.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {


        System.out.println("*****");

        Course course1 = new Course(1, "Java Kampi 22", 67000);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao());
        courseManager.add(course1);
        //courseManager.add(course2);

        Category category1 = new Category(1, "Java");
        //*CatogoryManager= new CatogoryManager(new JdbcCategoryDao());
        CatogoryManager catogoryManager = new CatogoryManager(new HibernateCategoryDao());
        catogoryManager.addCatagory(category1);

        Instructor instructor = new Instructor(1,"Engin","Demirog","eee@mmm");

        InstructurManager instructurManager=new InstructurManager(new JdbcInstructorDao());
        instructurManager.add(instructor);


        System.out.println();
        Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};

        for (Logger logger : loggers) {
            logger.log("Mesaj");

        }


    }
}

/*
Product product1=new Product(1,"Galaxy 22",10);


       Logger[] loggers={};
        ProductManager productManager=new ProductManager(new JdbcProductDao(),loggers);
       // ProductManager productManager2=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
        //productManager2.add(product1);
*/