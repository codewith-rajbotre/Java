//MultidimensionalArray.java
public class MultidimensionalArray {
    public static void main(String[] args) {
        // 1. Declaration and Initialization of a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2. Accessing elements
        System.out.println("Element at [1][2]: " + matrix[1][2]); // Output: 6

        // 3. Traversing using nested loops
        System.out.println("\nMatrix elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // 4. Creating and filling a 3D array
        int[][][] cube = new int[2][3][4]; // 2 layers, 3 rows, 4 columns

        // Fill with values
        int value = 1;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = value++;
                }
            }
        }

        // Display the 3D array
        System.out.println("\n3D Array elements:");
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
