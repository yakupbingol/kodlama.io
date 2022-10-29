
public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number=25;
		int remainder = number % 2 ;
		boolean isPrime = true;
		//System.out.println(remainder);
		
		if(number==1) {
			System.out.println("Sayi asal degildir");
			return;
		}
		if(number<1) {
			System.out.println("Hatali sayi");
			return;
			
		}
		
		for(int i=2; i<number;i++) {
			if(number % i ==0) {
				isPrime = false;
			}
			
		}
		if(isPrime) {
			System.out.println("Sayi asaldir");
		}
		else {
			System.out.println("Sayi asal degildir");
		}
	}

}
