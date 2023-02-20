package hafta3�dev3.dataAccess;

import hafta3�dev3.entities.Category;
import hafta3�dev3.entities.Course;
import hafta3�dev3.entities.Instructor;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao {

	@Override
	public void add(Course course) throws Exception {
		String courseName = course.getCourseName();
		double coursePrice = course.getCoursePrice();
		System.out.println(courseName + coursePrice + "hibernate ile eklendi.");

	}

	@Override
	public void add(Category category) throws Exception {
		String categoryName = category.getCategoryName();
		System.out.println(categoryName + " hibernate ile eklendi.");

	}

	@Override
	public void add(Instructor instructor) throws Exception {
		String firstName = instructor.getFirstName();
		String lastName = instructor.getLastName();
		System.out.println(firstName + lastName + "hibernate ile eklendi");
	}

}
