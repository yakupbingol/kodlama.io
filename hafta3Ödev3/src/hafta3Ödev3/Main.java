package hafta3Ödev3;

import hafta3Ödev3.entities.Category;
import hafta3Ödev3.entities.Course;
import hafta3Ödev3.entities.Instructor;
import hafta3Ödev3.logging.DatabaseLogger;
import hafta3Ödev3.logging.FileLogger;
import hafta3Ödev3.logging.MailLogger;
import hafta3Ödev3.business.CategoryManager;
import hafta3Ödev3.business.CourseManager;
import hafta3Ödev3.business.ÝnstructorManager;
import hafta3Ödev3.dataAccess.HibernateDao;
import hafta3Ödev3.dataAccess.JdbcDao;

public class Main {

	public static void main(String[] args) throws Exception {
		 // Eðitmen sýnýfýný çaðýrma
        Instructor instructor = new Instructor("Engin", "Demiroð");
        ÝnstructorManager instructorManager = new ÝnstructorManager();
        instructorManager.add(instructor);

        ////////////////////////////////////////////


        // Kategori sýnýfýný çaðýrma
        Category category = new Category("Programlama");
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.add(category);


        ////////////////////////////////////////////

        // Kurs sýnýfýný çaðýrma
        Course course = new Course("java + React", 10);
        CourseManager courseManager = new CourseManager();
        courseManager.add(course);


        ////////////////////////////////////////////


        // Loglama Bölümü
        FileLogger fileLogger = new FileLogger();
        fileLogger.log(instructor, course, category);

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log(instructor, course, category);

        MailLogger mailLogger = new MailLogger();
        mailLogger.log(instructor, course, category);

        ////////////////////////////////////////////


        // Hibernate vs JDBC Bölümü
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
