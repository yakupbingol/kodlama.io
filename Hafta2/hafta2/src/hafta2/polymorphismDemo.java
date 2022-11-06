package hafta2;

public class polymorphismDemo {

	public static void main(String[] args) {
		/*
		 * BaseLogger [] loggers = new BaseLogger[] {new FileLogger(), new
		 * EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		 * 
		 * for(BaseLogger logger:loggers) { logger.Log("Log mesajý"); }
		 */
		
		CustomerManager2 customerManager = new CustomerManager2(new DatabaseLogger());
		customerManager.add();

	}

}
