import java.util.Arrays;
import java.util.Scanner;

public class makeSecurityCode {
//	static String[] answer = new String[50000];
//	static int answerCount = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int C = sc.nextInt();
		String cToString = "";
		char[] c = new char[C];

		for (int i = 0; i < C; i++) {
			c[i] = sc.next().trim().charAt(0);
		}
		// 1. 입력 받은 문자 사전순으로 정렬
		Arrays.sort(c);

		// 2. 총문자의 갯수에서 n개만큼의 경우의 수 구하기
		// 3. 각각의 문자에 대해 한개의 모음과 두개의 자음이 있는지를 체크
		findCase(c, "", L, 0);


	}

	static void findCase(char[] string, String password, int L, int i) {//1.param: total_alpha, 2.param: password, 3.param: passwordLength, 4.param: i 해당문자를 사용해야할지 말지의 인덱스 
		//possible case
		if(password.length() == L){
			if(stringCheck(password))
				System.out.println(password);
			return;
		}
		
		//impossible case
		if(i >= string.length)
			return;
		
		findCase(string, password+string[i], L, i+1);//can
		findCase(string, password, L, i+1);//can not
	}

	static boolean stringCheck(String password) {
		boolean result = false;
		int jaCount = 0;
		int moCount = 0;
		char[] string = password.toCharArray();

		for (int i = 0; i < string.length; i++) {
			if (string[i] == 'a' || string[i] == 'A') {
				moCount++;
			}
			else if (string[i] == 'e' || string[i] == 'E') {
				moCount++;
			}
			else if (string[i] == 'i' || string[i] == 'I') {
				moCount++;
			}
			else if (string[i] == 'o' || string[i] == 'O') {
				moCount++;
			}
			else if (string[i] == 'u' || string[i] == 'U') {
				moCount++;
			}else{
				jaCount++;
			}
		}
		
		if(moCount >= 1 && jaCount >= 2)
			result = true;
		
		return result;
	}
}
