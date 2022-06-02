import java.util.Scanner;

public class Ex_08_02 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int SIZE = 2;
		
		int[] numbers = new int[SIZE];
		
		int num = 0;
		while (num < SIZE) {
		    if(!scan.hasNextInt()) break;
		    
		    int n = scan.nextInt();
		  //  System.out.println(n*10);
		    numbers[num] = n;
		  
		    num++;
		}
		
		int total = 0;
		int count_num = 0;
		int n = 0;
		if(numbers[0] < numbers[1]) {
		    while (count_num < numbers[1]) {
		        count_num = numbers[0] + n;
		        total = total + count_num;
		        n++;
		    }
		} else if (numbers[0] > numbers[1]) {
		    while (count_num < numbers[0]) {
		        count_num = numbers[1] + n;
		        total = total + count_num;
		        n++;
		    }
		} else {
		   total = numbers[0];
		}
		
		
	    System.out.println(total);
    }
}