import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex_08_01 {
    public static void main(String[] args){
        try{
            Scanner file = new Scanner(new File(args[0]));
            int max_total = 0;
            while (file.hasNext()) {
                int total = 0;
                for (int j=1; j<=3; j++) {
                    int current_number = file.nextInt();
                    total += current_number;
                }
                
                if (total > max_total) {
                    max_total = total;
                }
                
                System.out.println(total);
            }
            System.out.println("max:" + max_total);
            file.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}