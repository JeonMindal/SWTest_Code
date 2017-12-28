import java.util.Scanner;

public class dp_findExit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int col = sc.nextInt();
		int row = sc.nextInt();
		int[][] a = new int[col][row];

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println(bottomup(a, col, row));
	}

	static int bottomup(int[][] a, int col, int row) {
		int[][] d = new int[col][row];

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {

			}
		}

		return Math.max(d[col * row - 1][0], Math.max(d[col * row - 1][1], d[col * row - 1][2]));
	}
}
