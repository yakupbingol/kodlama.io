package hafta3�dev3.logging;

import hafta3�dev3.entities.Category;
import hafta3�dev3.entities.Course;
import hafta3�dev3.entities.Instructor;

public interface Logger {
	void log(Instructor instructor, Course course, Category category);
}
