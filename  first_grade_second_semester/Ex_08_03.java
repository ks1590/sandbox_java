// [演習課題8-3]のソースファイル
import java.io.*;
import java.util.Scanner;
 
public class Ex_08_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, max_num = 0;
        int[] num = new int[10];
        int n = scan.nextInt() + 2;
        scan.close();
 
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String str = br.readLine();
            for (i = 0; i < n; i++) {
                if (str.charAt(i) == '.') {
                 continue;
                }
                num[Character.getNumericValue(str.charAt(i))]++;
                
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        max_num = num[0];
        for (i = 0; i < 10; i++) {
            if (max_num < num[i]) {
                max_num = num[i];
            }
        }
        for (i = 0; i < 10; i++) {
            if (max_num == num[i]) {
                System.out.println(i + ":" + num[i]);
            }
        }
    }
 }
