package h3;

public class h3_Main {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {1,2,4,3};
		
		System.out.print(compareArraysVal(a,b));
	}
	
	public static boolean compareArraysVal(int[] a, int[] b){
		
		if (a.length != b.length) {
			return false;
			}
		
		for(int i = 0; i < a.length ; i++) { // Jeden Eintrag von a und b zählen und dann die Anzahl vergleichen

			int counterA = 0;
			int counterB = 0;
			
			for(int j = 0; j< a.length; j++) { // Zählen wie oft a_i in a vorkommt
				if(a[i] == a[j]) {
					counterA++;
				}
			}
				
			for(int k = 0; k < b.length; k++) { // Zählen wie oft a_i in b vorkommt
				if(a[i] == b[k]) {
					counterB++;
				}
			}
			
			if(counterA != counterB) {
				return false;
			}
		}
		return true;
	}
}