package h1;

public class h1_Main {

	public static void main(String[] args) {
		int a[] = {4,3,2,1};
		int b[] = {1,2,3,4};
		
		System.out.print(isMirrorArray(a,b));
	}
	
	public static boolean isMirrorArray(int[] a, int[] b){
		if(a.length != b.length) return false; // Zwar nicht explizit angegeben aber man weiß ja nie
    for(int i = 0; i < a.length; i++) {
        if(a[i] != b[b.length-1-i]) return false;
    }
    return true;
	}
}
