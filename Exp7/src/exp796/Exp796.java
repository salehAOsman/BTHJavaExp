package exp796;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exp796 {
	static StopWatch time = new StopWatch();
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int range = 100000;
		int[] arr = new int[range];
		int x = 0;
		int count = 0;

		System.out.println("Start time:" + time.getStartTime()+"\n----------------\n") ;
		Random rand = new Random();
		while (count <= range-1) {
			x = rand.nextInt();
			arr[count] = x;
			System.out.println(count + " befor sort " + arr[count]);
			count++;
		}

		System.out.println("sorted-----------------\n");
		Arrays.sort(arr);
		count = 1;
		
		for (int i : arr) {
			System.out.println(count + " after sort " + i);
			count++;
		}

		time.stop();
		System.out.println("\n---------------\n"+" End time: "+ time.getEndTime() );
		System.out.println("\n--------------\nElaps: " + time.getElapsedTime());
	}
}