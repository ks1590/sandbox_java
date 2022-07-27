import java.util.Scanner;

public class Ex_08_01 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int SIZE = 5;
		
		int[] numbers = new int[SIZE];
		
		int num = 0;
		while (num < SIZE) {
		    if(!scan.hasNextInt()) break;
		    
		    int n = scan.nextInt();
		    numbers[num] = n;
		  
		    num++;
		}
		
		
		for(int i=4; i>=0; i--) {
		    System.out.println(numbers[i]);
		}
    }
}