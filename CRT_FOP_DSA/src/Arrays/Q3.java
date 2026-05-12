package Arrays;

import java.util.Scanner;

// multidimensional array
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] md = new int[3][3];
        for (int i = 0; i < md.length; i++) {
            for (int j = 0; j < md.length ; j++) {
                md[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < md.length; i++) {
            for (int j = 0; j < md.length; j++) {
                System.out.print(md[i][j] + " ");
            }
            System.out.println();
        }

    }
}
