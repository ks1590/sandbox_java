import java.util.Scanner;
import java.util.Random;

public class Ex_04_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = 100;
        int seed = scan.nextInt();
        
        String[] resultMessage = new String[6];
        resultMessage[0] = "1:";
        resultMessage[1] = "2:";
        resultMessage[2] = "3:";
        resultMessage[3] = "4:";
        resultMessage[4] = "5:";
        resultMessage[5] = "6:";
        
        int data[];
        data = dice(count, seed);
        
        for (int i=0; i<data.length; i++) {
            switch(data[i]) {
                case 1:
                    resultMessage[0] = resultMessage[0] + "*";
                    break;
                case 2:
                    resultMessage[1] = resultMessage[1] + "*";
                    break;
                case 3:
                    resultMessage[2] = resultMessage[2] + "*";
                    break;                
                case 4:
                    resultMessage[3] = resultMessage[3] + "*";
                    break;
                case 5:
                    resultMessage[4] = resultMessage[4] + "*";
                    break;
                case 6:
                    resultMessage[5] = resultMessage[5] + "*";
                    break;                            
            }
        }
        
        for (int i=0; i<resultMessage.length; i++) {
            System.out.println(resultMessage[i]);
        }
    }
    
    public static int[] dice(int count, int seed) {
        
        Random rand = new Random(seed);
        // Random rand = new Random(1);
        
        int[] result = new int[count];
        
        for (int i=0; i<count; i++) {
            int dice = rand.nextInt(6) + 1;
            result[i] = dice;
        }
        
        return result;
    }
}