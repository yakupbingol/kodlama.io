package hafta3Ödev3.business;

import hafta3Ödev3.dataAccess.InstructorDao;
import hafta3Ödev3.entities.Instructor;

public class ÝnstructorManager implements InstructorDao    {

	@Override
	public void add(Instructor instructor) throws Exception {
		String firstName = instructor.getFirstName();
		String lastName = instructor.getFirstName();
		
		if(!instructor.getFirstName().equalsIgnoreCase("Engin") && instructor.getLastName().equalsIgnoreCase("Demiroð")) {
			throw new Exception("Böyle egitmen yok");
		}
		else {
			System.out.println(instructor.getFirstName() + instructor.getLastName());
		}
		
		
		
	}

}
