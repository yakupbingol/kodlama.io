package hafta3Ödev3.business;

import java.util.ArrayList;

import hafta3Ödev3.dataAccess.CourseDao;
import hafta3Ödev3.entities.Course;

public class CourseManager implements CourseDao{

	@Override
	public void add(Course course) throws Exception {
		if(course.getCoursePrice() < 0) {
			throw new Exception("0 dan kücük fiyat olmaz.");
		}
		
		//String [] array = {"Java" , ".Net", "C# + Angular" , "JavaScript" , "Java + React" , "Programlamaya Giriþ"};
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add(".Net");
		list.add("C# ve Angular");
		list.add("JavaScript");
		list.add("Java ve React");
		list.add("Programlamaya Giriþ");
		System.out.println("Kurs seçildi." + course.getCourseName());
		
		
	}
	

}
