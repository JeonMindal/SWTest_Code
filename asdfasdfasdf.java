import java.util.Arrays;
import java.util.Scanner;

import sun.applet.Main;

public class test {
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 15));
		Scanner sc = new Scanner(System.in);
		String b = "";
		
		for (int i = 0; i < 6; i++) {
			char a = sc.next().trim().charAt(0);
			b += a;
		}
		System.out.println("non sorted = " + b);
		
		char[] c = b.toCharArray();
		Arrays.sort(c);
		System.out.println("sorted = " + new String(c));
		
		System.out.println("test = " + "msjeon" + '5');
		
		for (int i = 0; i < 0; i++) {
			System.out.println("kkk");
		}
	}
}
