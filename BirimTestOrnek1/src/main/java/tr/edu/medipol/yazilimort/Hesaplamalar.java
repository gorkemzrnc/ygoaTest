package tr.edu.medipol.yazilimort;

public class Hesaplamalar {
	public static int faktoriyelRec(int n ) {
		if (n == 1) return 1;
		return n * faktoriyelRec(n-1);
	}
	
	public static int faktoriyelLoop(int n) {
		int sonuc = 1;
		for(int i = n; i>1; i--) {
			sonuc = sonuc * i;
		}
		return sonuc;
	}
	public static int toplama(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	public static int cikarma(int sayi1, int sayi2) {
		return sayi1-sayi2;
	}
	public static int carpma(int sayi1, int sayi2) {
		return sayi1*sayi2;
	}
}
