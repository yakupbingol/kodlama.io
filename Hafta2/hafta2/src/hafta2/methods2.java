package hafta2;

public class methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj1 = mesaj.substring(0, 2);
		System.out.println(yeniMesaj1);
		String yeniMesaj2 = sehirVer();
		System.out.println(yeniMesaj2);
		int sayi = topla(7, 9);
		System.out.println(sayi);

	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

}
