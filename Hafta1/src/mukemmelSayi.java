
public class mukemmelSayi {

	public static void main(String[] args) {
		int number =28;
		int temp = 0;
		
		for(int i=1; i<number;i++) {
			if(number % i ==0) {
				temp = temp + i;
			}
		}
		if ( number == temp) {
			System.out.println("M�kemmel Sayidir.");
		} 
		else {
			System.out.println("M�kemmel Sayi De�ildir");
		}

	}

}
