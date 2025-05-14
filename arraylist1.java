import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        
    int sum=0;
    ArrayList<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(2);
    num.add(3);
    num.add(5);

    for(Integer i:num)
    {
         sum= sum+i;
    }
    System.out.println(sum);
}
}

