import java.util.Scanner;

public class sqmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int ar[][] = new int[size][size];

        // inputing values from user
        System.out.println("enter the number in array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        // printing array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println("");
        }

        // checking for symmetry
        int flag = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (ar[i][j] != ar[j][i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;

        }

        if (flag == 1)
            System.out.println("Not Symmetrical");
        else
            System.out.println("Symmetrical");

        sc.close();
    }
}
