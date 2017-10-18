import java.util.Scanner;

public class dp_coin2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(bottomup(a, n, k));
	}
	
	static int bottomup(int[] a, int n, int k){
		int[] d = new int[k];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
			}
		}
	}
}
				