package h2;

public class h2_Main {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		
		System.out.print(compareArrays(a,b));
	}
	
	public static boolean compareArrays(int[] a, int[] b){
		
		if (a.length != b.length) {
			return false;
		}
		
		for(int i = 0; i < a.length ; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

}
