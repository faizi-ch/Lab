import java.util.Scanner;

public class Lab
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of rows of matrix: ");
		int r = in.nextInt();
		System.out.print("Enter number of columns of matrix: ");
		int c = in.nextInt();
		MatrixMan a = new MatrixMan(r, c);
		MatrixMan a2 = new MatrixMan(a); //copying attributes of object a to a2


		System.out.println("Enter 1st matrix:");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				System.out.print("Enter value at [" + i + "][" + j + "]:");
				a.arr[i][j] = in.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter 2nd matrix:");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				System.out.print("Enter value at [" + i + "][" + j + "]:");
				a.arr2[i][j] = in.nextInt();
			}
		}
		if (MatrixMan.compareMatrices(a.arr, a.arr2) == true)
			System.err.println("Matrices are equal");
		else
			System.err.println("Matrices are not equal");

		System.out.println("Addition of matrices:");
		int[][] arrt = MatrixMan.addMatrices(a.arr, a.arr2);
		for (int i = 0; i < arrt.length; i++)
		{
			for (int j = 0; j < arrt.length; j++)
			{
				System.out.print(arrt[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Subtraction of matrices:");
		int[][] arrt2 = MatrixMan.subtractMatrices(a.arr, a.arr2);
		for (int i = 0; i < arrt2.length; i++)
		{
			for (int j = 0; j < arrt2.length; j++)
			{
				System.out.print(arrt2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Multiplication of matrices:");
		int[][] arrt3 = MatrixMan.multiplyMatrices(a.arr, a.arr2);
		for (int i = 0; i < arrt3.length; i++)
		{
			for (int j = 0; j < arrt3.length; j++)
			{
				System.out.print(arrt3[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
class MatrixMan
{
	int[][] arr;
	int[][] arr2;

	MatrixMan(int i, int j)
	{
		arr = new int[i][j];
		arr2 = new int[i][j];
	}
	MatrixMan(MatrixMan o)
	{

		arr=o.arr;
		arr2=o.arr2;
	}

	static boolean compareMatrices(int[][] a, int[][] b)
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[i][j] != b[i][j])
					return false;
			}

		}
		return true;
	}
	static int[][] addMatrices(int[][] a, int[][] b)
	{
		int[][] temp;
		temp=new int[a.length][a.length];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				temp[i][j] = a[i][j] + b[i][j];
			}

		}
		return temp;
	}
	static int[][] subtractMatrices(int[][] a, int[][] b)
	{
		int[][] temp;
		temp = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				temp[i][j] = a[i][j] - b[i][j];
			}

		}
		return temp;
	}
	static int[][] multiplyMatrices(int[][] a, int[][] b)
	{
		int[][] temp;
		temp = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				for (int k = 0; k < a.length; k++)
				{
					temp[i][j] += a[i][k] * b[k][j];
				}
			}

		}
		return temp;
	}

}