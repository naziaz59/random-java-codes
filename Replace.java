import java.util.*;

class Replace_words {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = sc.nextLine();
        s = s.replace(" ", "/");
        System.out.println(s);
        sc.close();
    }
}