import java.util.Scanner;

public class goodNumber2 {
	static int Answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			
			int numCount = sc.nextInt();
			int[] numArr = new int[numCount];
			
			for (int i = 0; i < numCount; i++) {
				numArr[i] = sc.nextInt();
			}
			
			for (int i = 0; i < numCount; i++) {
				if(i == 0){
					continue;
				}
				else if(i == 1){
					if(numArr[i]*3 == numArr[i+1])
						Answer++;
				}
				else{
					int base = numArr[i];
					
					for (int j = 0; j < i; j++) {
						
					}
				}
			}
		}
	}
}
