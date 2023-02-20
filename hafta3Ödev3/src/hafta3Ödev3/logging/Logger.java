package hafta3Ödev3.logging;

import hafta3Ödev3.entities.Category;
import hafta3Ödev3.entities.Course;
import hafta3Ödev3.entities.Instructor;

public interface Logger {
	void log(Instructor instructor, Course course, Category category);
}
