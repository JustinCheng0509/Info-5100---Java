public class rotate {
    public int[][] rotate(int[][] matrix) {
        return matrix;
    }

    public static void main (String args[]){
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate r1 = new rotate();
        /*for (int i = 0; i < array.length; i++){
            for (int j=0; j< array.length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        */


        int matrix[][];
        matrix = r1.rotate(array);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
            //System.out.println(array);
    }
}
