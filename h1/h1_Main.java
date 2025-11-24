package h1;

public class h1_Main {

	public static void main(String[] args) {
		int a[] = {4,3,2,1};
		int b[] = {1,2,3,4};
		
		System.out.print(isMirrorArray(a,b));
	}
	
	public static boolean isMirrorArray(int[] a, int[] b){
		int j = 0;
		boolean question = false;
		
		for(int i = a.length - 1; i >= 0 ; i--) {
			if (a[i] == b[j]) {
				question = true;
				j++;
			}
			else {
				question = false;
				break;
			}
		}
		return question;
	}

}
