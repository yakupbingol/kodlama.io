package hafta3�dev3.entities;

public class Course {
	String courseName;
	double coursePrice;

	public Course(String courseName, double coursePrice) {
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;

	}

}
