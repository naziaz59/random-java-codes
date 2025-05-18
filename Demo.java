class Calc {
    int a;

    public int add(int b, int c) {
        System.out.println("In add");
        return b + c;
    }
}

class Demo {
    public static void main(String args[]) {
        Calc ob = new Calc();
        int value = ob.add(2, 3);
        System.out.println(value);
    }
}