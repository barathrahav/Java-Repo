public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        int myArr[][] = {{6, 42, 1, 8}, {3, 7, 8, 9}};

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}