package hafta3�dev3.business;

import hafta3�dev3.dataAccess.InstructorDao;
import hafta3�dev3.entities.Instructor;

public class �nstructorManager implements InstructorDao    {

	@Override
	public void add(Instructor instructor) throws Exception {
		String firstName = instructor.getFirstName();
		String lastName = instructor.getFirstName();
		
		if(!instructor.getFirstName().equalsIgnoreCase("Engin") && instructor.getLastName().equalsIgnoreCase("Demiro�")) {
			throw new Exception("B�yle egitmen yok");
		}
		else {
			System.out.println(instructor.getFirstName() + instructor.getLastName());
		}
		
		
		
	}

}
