package homework2;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = enterMatrix(sc);
		int[][] b = enterMatrix(sc);
		System.out.print(haveSameDimension(a,b));
	}

	public static int[][] enterMatrix(Scanner sc) {
        System.out.print("Nhap vao so hang: ");
        int m = sc.nextInt();
        System.out.print("Nhap vao so cot: ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Nhap vao gia tri cho ma tran:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\tPhan tu thu [" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
	
	public static void print(int[][] matrix) {
		for(int roll = 0; roll < matrix.length; roll++) {
			for(int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[roll][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean haveSameDimension(int[][] a, int[][] b) {
		if(a.length != b.length && a[0].length != b[0].length ) {
			return false;
		}
		for(int roll = 0; roll < a.length; roll++) {
			for(int col = 0; col < a[0].length; col++) {
				if(a[roll][col] != b[roll][col]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int[][] add(int[][] m1, int[][] m2) {
		int[][] add = new int[m1.length][m1.length];
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add.length; j++) {
				add[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return add;
	}
	
	public static int[][] subtract(int[][] m1, int[][] m2) {
		int[][] add = new int[m1.length][m1.length];
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add.length; j++) {
				add[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return add;
	}
}
