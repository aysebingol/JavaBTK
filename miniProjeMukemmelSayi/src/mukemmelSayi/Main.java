package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 28;
		int toplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
		}
		if (sayi == toplam) {
			System.out.println("M�kemmel sayidir");
		} else {
			System.out.println("m�kemmel sayi de�ildir");
		}
	}

}
