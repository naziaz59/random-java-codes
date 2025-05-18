
import java.util.*;

class hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sq = n * n;
        System.out.println("The sq is " + sq);
        sc.close();
    }
}