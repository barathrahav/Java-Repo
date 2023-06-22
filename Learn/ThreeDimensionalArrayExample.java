public class ThreeDimensionalArrayExample {
    public static void main(String[] args) {
        int myArr[][][] = {
            { {6, 4, 1}, {3, 7, 7}, {5, 8, 9} },
            { {7, 8, 5}, {3, 7, 2}, {5, 8, 2} },
            { {5, 2, 8}, {3, 7, 9}, {5, 8, 3} }
        };

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                for (int k = 0; k < myArr[i][j].length; k++) {
                    System.out.print(myArr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
