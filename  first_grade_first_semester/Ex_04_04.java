import java.util.Scanner;

public class Ex_04_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        
        double base = calcBasicWeight(num1);
        double diffWeight = num2 - base;
        
        String message = "";
        if (diffWeight < -10.0) {
            message = "Underweight";
        } else if (diffWeight >= -10.0 && diffWeight <= 10.0) {
            message = "Normal";
        } else {
            message = "Overweight";
        }
        
        System.out.println(String.format("%.1f",base));
        System.out.println(message);
    }
    
    public static double calcBasicWeight(double height) {
        return Math.pow((height / 100.0),2) * 22.0;
    }
}