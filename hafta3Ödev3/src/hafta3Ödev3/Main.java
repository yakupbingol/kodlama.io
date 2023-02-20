package hafta3�dev3;

import hafta3�dev3.entities.Category;
import hafta3�dev3.entities.Course;
import hafta3�dev3.entities.Instructor;
import hafta3�dev3.logging.DatabaseLogger;
import hafta3�dev3.logging.FileLogger;
import hafta3�dev3.logging.MailLogger;
import hafta3�dev3.business.CategoryManager;
import hafta3�dev3.business.CourseManager;
import hafta3�dev3.business.�nstructorManager;
import hafta3�dev3.dataAccess.HibernateDao;
import hafta3�dev3.dataAccess.JdbcDao;

public class Main {

	public static void main(String[] args) throws Exception {
		 // E�itmen s�n�f�n� �a��rma
        Instructor instructor = new Instructor("Engin", "Demiro�");
        �nstructorManager instructorManager = new �nstructorManager();
        instructorManager.add(instructor);

        ////////////////////////////////////////////


        // Kategori s�n�f�n� �a��rma
        Category category = new Category("Programlama");
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.add(category);


        ////////////////////////////////////////////

        // Kurs s�n�f�n� �a��rma
        Course course = new Course("java + React", 10);
        CourseManager courseManager = new CourseManager();
        courseManager.add(course);


        ////////////////////////////////////////////


        // Loglama B�l�m�
        FileLogger fileLogger = new FileLogger();
        fileLogger.log(instructor, course, category);

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log(instructor, course, category);

        MailLogger mailLogger = new MailLogger();
        mailLogger.log(instructor, course, category);

        ////////////////////////////////////////////


        // Hibernate vs JDBC B�l�m�
        HibernateDao hibernateDao = new HibernateDao();
        hibernateDao.add(category);
        hibernateDao.add(course);
        hibernateDao.add(instructor);

        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.add(category);
        jdbcDao.add(course);
        jdbcDao.add(instructor);
		
		
		

	}

}
