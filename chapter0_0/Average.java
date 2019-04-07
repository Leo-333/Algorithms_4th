package chapter0_0;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {

	public static void main(String[] args) {
		// 取StdIn中所有数的平均数
		double sum = 0.0;
		int cnt = 0;
		while (!StdIn.isEmpty())
		{
			sum += StdIn.readDouble();
			cnt ++;
		}
		double avg = sum/cnt;
		StdOut.printf("Average is %.5f\n", avg);

	}

}
