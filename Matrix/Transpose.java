package Matrix;

public class Transpose {
    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1, 1 }, 
                        { 2, 2, 2, 2 }, 
                        { 3, 3, 3, 3 }, 
                        { 4, 4, 4, 4 } }; 
        
        System.out.println("Original Matrix:");
        printMatrix(mat);

        System.out.println("Transposed Matrix:");
        transpose(mat);
        printMatrix(mat); // Print the transposed matrix
    }

    public static void transpose(int A[][]) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap A[i][j] and A[j][i]
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }

    public static void printMatrix(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
