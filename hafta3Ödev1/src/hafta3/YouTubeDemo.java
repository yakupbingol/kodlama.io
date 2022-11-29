package hafta3;

public class YouTubeDemo {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
				
		
/*
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "İstanbul";

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();

		Company company = new Company();
		company.taxNumber = "123123";
		company.companyName = "Arcelik";
		company.id = 101;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());

		Person person = new Person();
		person.firstName = "Yakup";
		person.lastName = "Bıngol";
		person.nationalIdendity = "1234567891";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
*/
	}

}
