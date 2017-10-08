import java.util.*;

public class oneTwoThreeSum_recurcive {
	static int sum = 0;
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int goal = sc.nextInt();
			
			if(goal > 10)
				continue;
			
			int now = go(count, sum, goal);
			
			System.out.println(now);
		}
	}
	
	static int go(int count, int sum, int goal){
		//impossible case
		if(sum > goal){
			return 0;
		}
		//possible case
		if(sum == goal){
			return 1;
		}
		int now = 0;
		now += go(count+1, sum+1, goal);
		now += go(count+1, sum+2, goal);
		now += go(count+1, sum+3, goal);

		return now;
	}
}
