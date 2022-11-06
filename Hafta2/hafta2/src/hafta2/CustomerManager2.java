package hafta2;

public class CustomerManager2 {
	private BaseLogger logger;
	
	public CustomerManager2(BaseLogger logger) {
		this.logger = logger;
		
	}
	public void add() {
		System.out.println("Müþteri eklendi");
		this.logger.log("Log mesajý");
		
	}

}
