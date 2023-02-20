package hafta3�dev3.logging;

import java.text.MessageFormat;

import hafta3�dev3.entities.Category;
import hafta3�dev3.entities.Course;
import hafta3�dev3.entities.Instructor;

public class MailLogger implements Logger {

	
	public void log(Instructor instructor, Course course, Category category) {
		String firstName = "Egitmen ad�: " + instructor.getFirstName();
		String lastName = "Egitmen soyad�:  " + instructor.getLastName();
		String courseName = "Kurs ad�: " + course.getCourseName();
		String categoryName = "Kategori: " + category.getCategoryName();
		String coursePrice = "Fiyat�: " + course.getCoursePrice();
		  String string = MessageFormat.format("\nDosyaya Loglan�yor...\n{0}\n{1}\n{2}\n{3}\n{4} ", firstName, lastName, courseName, categoryName, coursePrice);
			System.out.println(string);
	
		
	}

}
