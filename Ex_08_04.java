import java.util.Scanner;

public class Ex_08_04 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
    		int stringLengthWithoutSpaces = scan.nextLine().replace(" ", "").length();
    	    System.out.println(stringLengthWithoutSpaces);    
		}
    }
}