import java.util.Scanner;

public class dp_palindromeSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(bottomup(str));
	}
	static int bottomup(String str){
		StringBuffer sb = new StringBuffer(str);
		int[] d = new int[str.length()];
		d[0] = 0;
		for (int i = 1; i < str.length(); i++) {
			d[i] = -1;
			for (int j = 0; j < i; j++) {
				if(isPalindrome(sb.substring(j, i))){
					if(d[i] == -1 || d[i] > d[j] + 1)
						d[i] = d[j] + 1;
				}
			}
		}
		return d[str.length() - 1];
	}
	
	static boolean isPalindrome(String str){
		StringBuffer sb = new StringBuffer(str);
		
		if(str.length() == 0 || str.length() == 1){
			return true;
		}
		
		if(str.length() == 2){
			if(sb.charAt(0) == sb.charAt(1))
				return true;
			else 
				return false;
		}
		
		for (int i = 0, j=str.length()-1; i < str.length() && j >= 0; j--,i++) {
			if(sb.charAt(i) != sb.charAt(j))
				return false;
		}
		
		return true;
	}
}
