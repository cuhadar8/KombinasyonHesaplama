import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kombinasyon hesabı programı");
		System.out.print("C(n,r) gösterimine göre n sayısını giriniz: ");
		int n = scanner.nextInt();
		
		System.out.print("C(n,r) gösterimine göre r sayısını giriniz: ");
		int r = scanner.nextInt();
		
		int nToplam = 1, rToplam = 1, fToplam = 1;
		
		for(int i = 1; i<=n; i++) {
			nToplam*=i;
		}
		
		for(int i = 1; i<=r; i++) {
			rToplam*=i;
		}
		
		for(int i = 1; i<=n-r; i++) {
			fToplam*=i;
		}
		
		int comb = nToplam / (rToplam * fToplam);
		System.out.println("Sonuç: " + comb);
		
	}

}
