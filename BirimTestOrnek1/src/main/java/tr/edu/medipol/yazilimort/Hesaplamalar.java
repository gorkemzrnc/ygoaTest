package tr.edu.medipol.yazilimort;

public class Hesaplamalar {
	public int faktoriyelRec(int n ) {
		if (n == 1) return 1;
		return n * faktoriyelRec(n-1);
	}
	
	public int faktoriyelLoop(int n) {
		int sonuc = 1;
		for(int i = n; i>1; i--) {
			sonuc = sonuc * 1;
		}
		return sonuc;
	}
}
