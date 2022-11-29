package hafta3;

public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;

	}

	public void save() {
		System.out.println("Musteri Kaydedildi: ");

	}
	
	public void delete() {
		
		System.out.println("Musteri Silindi: ");
	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi verildi.");
	}

}
