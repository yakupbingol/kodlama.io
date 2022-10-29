package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//degisken isimlendirmeleri java'da camelCase yazýlýr
		String ortaMetin="Ýlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade =12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		
		String okYonu ="down.svg";
		
		if(dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun > dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hýzlý Kredi", "Maaþýný Halkbanktan", "Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		System.out.println();
		System.out.println("döngüyle yapýlan: ");
		System.out.println();
		
		for(int i =0; i< krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
