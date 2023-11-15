package NumberTasks;

public class IntegerFormattingExample {
    public static void main(String[] args) {
        int age = 30;
        double weight = 26.58585;
        System.out.printf("My age is: %d\n", age);
        //System.out.printf("My bag weight is: %d\n", weight);
        System.out.printf("My bag weight is: %.2f", weight);
    }
}