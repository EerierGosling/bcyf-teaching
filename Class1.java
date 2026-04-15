import java.util.Scanner;

class Class1 {

    public static Scanner sc = new Scanner(System.in);

    public Class1(String command) {
        
    }

    public static void main(String args[]) {

        System.out.println(factorial(0));

        // // Counter counter1 = new Counter(1);
        // // Counter counter2 = new Counter(2);
        
        // // for (int i = 1; i < 6; i = i + 1) {
        // //     someCounter.add();
        // // }

        // Counter.add(7);
        // Counter.add(8);

        // System.out.println(Counter.internalCounter);
        // System.out.println(Counter.internalCounter);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        int ans = num * factorial(num - 1);
        return ans;
    }

}

class Counter {
    
    public static int internalCounter;

    // public Counter(int num) {
    //     internalCounter = num;
    // }

    public static void add(int sum) {
        internalCounter += sum;
    }

}