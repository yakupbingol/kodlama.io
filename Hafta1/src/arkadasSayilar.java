
public class arkadasSayilar {

	public static void main(String[] args) {

		int sayi1 = 220;
		int sayi2 = 284;
		int temp = 0;
		int temp2 = 0;
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				temp2 = temp2 + i;
			}
		}

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				temp = temp + i;

			}
		}
		if (temp == sayi2 && temp2 == sayi1) {
			System.out.println("Arkada� say�s�d�r.");

		} else {
			System.out.println("Arkada� say�s� de�ildir.");
		}

	}

}
