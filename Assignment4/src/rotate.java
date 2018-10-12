public class rotate {
    public int[][] rotate(int[][] matrix) {
        int lth = matrix.length;
        for (int i = 0; i< lth; i++){
            for(int j = i; j < lth-i-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[lth-1-j][i];
                matrix[lth-1-j][i] = matrix[lth-1-i][lth-1-j];
                matrix[lth-1-i][lth-1-j] = matrix[j][lth-1-i];
                matrix[j][lth-1-i] = temp;
            }
        }
        return matrix;
    }

    void displayMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate r1 = new rotate();
        int matrix[][];
        matrix = r1.rotate(array);
        r1.displayMatrix(matrix);
        //System.out.println(array);
    }
}
