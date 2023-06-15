public class IncrementDecrement {
    public static void main(String[] args) {
        int number = 5;
        int preIncrement = ++number;
        int postIncrement = number++;
        int preDecrement = --number;
        int postDecrement = number--;

        System.out.println("Pre-Increment: " + preIncrement);
        System.out.println("Post-Increment: " + postIncrement);
        System.out.println("Pre-Decrement: " + preDecrement);
        System.out.println("Post-Decrement: " + postDecrement);
    }
}