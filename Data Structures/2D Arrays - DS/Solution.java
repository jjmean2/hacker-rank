import java.io.*;
import java.util.*;

public class Solution {

    public int sumOfHourglass(int[][] array, int row, int column) {
        int sum = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                sum += array[i][j];
            }
        }
        sum -= (array[row+1][column] + array[row+1][column+2]);

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = in.nextInt();
            }
        }

        Solution sol = new Solution();

        boolean first = true;
        int max = 0;

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                int sum = sol.sumOfHourglass(array, row, column);
                if (first) {
                    first = false;
                    max = sum;
                } else if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
