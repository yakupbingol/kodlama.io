package hafta3Ödev3.logging;

import java.text.MessageFormat;

import hafta3Ödev3.entities.Category;
import hafta3Ödev3.entities.Course;
import hafta3Ödev3.entities.Instructor;

public class DatabaseLogger implements Logger {

	public void log(Instructor instructor, Course course, Category category) {
		String firstName = "Egitmen adý: " + instructor.getFirstName();
		String lastName = "Egitmen soyadý:  " + instructor.getLastName();
		String courseName = "Kurs adý: " + course.getCourseName();
		String categoryName = "Kategori: " + category.getCategoryName();
		String coursePrice = "Fiyatý: " + course.getCoursePrice();
		  String string = MessageFormat.format("\nDosyaya Loglanýyor...\n{0}\n{1}\n{2}\n{3}\n{4} ", firstName, lastName, courseName, categoryName, coursePrice);
			System.out.println(string);
	
		
	}
	
}
