import java.io.*;
import java.util.*;

public class Solution {
    
    public void printArrayReverseOrder(Scanner line, int length) {
        if (length < 0) return;

        int number = line.nextInt();
        
        if (length == 1) {
            System.out.print(number);
        } else { 
            printArrayReverseOrder(line, length-1);
            System.out.print(" " + number);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        new Solution().printArrayReverseOrder(in, length); 
    }
}
