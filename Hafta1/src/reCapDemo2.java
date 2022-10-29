
public class reCapDemo2 {

	public static void main(String[] args) {
		double [] myList = {1.2, 8.4,2.5,7.1};
		double total = 0;
		double max = myList[0];
		for(double number:myList) {
			System.out.println(number);
			total = total + number;
			if(max < number) {
				max = number;
			}
		}
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);
		

	}

}
