
public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 8, 9, 4, 3, 0 };
		int aranacak = 7;
		boolean varMi = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayi vardir.");
		} else {
			System.out.println("Sayi yoktur.");
		}

	}

}
