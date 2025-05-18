
import java.util.Scanner;

class Detect_Space {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = sc.nextLine();
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));
        sc.close();
    }
}