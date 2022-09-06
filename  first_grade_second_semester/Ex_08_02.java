import java.util.Scanner;
import java.util.Arrays;

public class Ex_08_02 {
    public static void main(String[] args){
        try{
            int list[] = new int[args.length];
            for (int i=0; i<args.length; i++) {
                list[i] = Integer.parseInt(args[i]);
            }
            
            Arrays.sort(list);
            for (int i=0; i<list.length; i++) {
                System.out.println(list[i]);
            }
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}