import java.util.Scanner;

public class goodNumber {
	static int Answer;
	final static int L = 3;
	
	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			
			int numCount = sc.nextInt();
			int[] numArr = new int[numCount];
			
			for (int i = 0; i < numCount; i++) {
				numArr[i] = sc.nextInt();
			}
			
			findGoodNum(numArr, 0, 0, 0, numArr[0], 0);

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;
		}
	}
	
	static void findGoodNum(int[] numArr, int count, int goalCount, int sum, int goal, int i){
		//possible
		if(sum == goal && count == L){
			Answer += 1;
			goalCount++;
			return;
		}
		
		//impossible
		if(i >= goalCount){//목표수 인덱스 위치보다 앞에 있을때만 계산한다.
			goalCount++;
			findGoodNum(numArr, 0, goalCount, 0, numArr[goalCount], 0);
			return;
		}
		
		//impossible
		if(sum > goal){
			return;
		}
		
		//impossible
		if(count > L || goalCount > numArr.length){
			return;
		}

		findGoodNum(numArr, count+1, goalCount, sum+numArr[i], numArr[goalCount], i+1);
		findGoodNum(numArr, count+1, goalCount, sum+numArr[i], numArr[goalCount], i);
	}
}
