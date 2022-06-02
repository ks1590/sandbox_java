import java.util.Scanner;

public class Ex_08_03 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (scan.hasNext()) {
            int value = scan.nextInt();
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
		
	    System.out.println(max);
	    System.out.println(min);
    }
}