public class TwoDArrays {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};

        System.out.println("Array 1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.printf("%d ", array1[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Array 2");
        double[][] array2 = new double[4][3];
        array2[0][0] = 1.1;
        array2[0][1] = 2.1;
        array2[0][2] = 3.1;
        array2[1][0] = 4.1;
        array2[1][1] = 5.1;
        array2[1][2] = 6.1;
        array2[2][0] = 7.1;
        array2[2][1] = 8.1;
        array2[2][2] = 9.1;
        array2[3][0] = 10.1;
        array2[3][1] = 11.1;
        array2[3][2] = 12.2;

        for (double[] row : array2) {
            for (double col : row) {
                System.out.printf("%.1f ", col);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array 3");

        String [][] array3 = new String[2][3];
        array3[0][0] = "Ann";
        array3[0][1] = "Andy";
        array3[0][2] = "Andrea";
        array3[1][0] = "John";
        array3[1][1] = "Joan";
        array3[1][2] = "Joanna";
        for (String[] row : array3) {
            for (String col : row) {
                System.out.printf("%s ", col);
            }
            System.out.println();
        }

    }



}
