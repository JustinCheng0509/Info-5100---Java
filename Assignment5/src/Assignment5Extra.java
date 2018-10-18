import java.util.*;
public class Assignment5Extra {
    public List<Integer>spriralOrder(int[][] matrix){
        List<Integer> spiral = new ArrayList<Integer>();
        if (matrix == null||matrix.length == 0 ||matrix[0].length == 0){
            return spiral;
        }
        int m = matrix.length,  n = matrix[0].length;
        while(m > 0 && n > 0) {
            if (m == 1) {
                for (int i = 1; i < n; i++) {
                    spiral.add(matrix[m][i]);
                }
                break;
            } else if (n == 1) {
                for (int i = 1; i < m; i++) {
                    spiral.add(matrix[i][n]);
                }
                break;
            }
            for (int i = 0; i < n-1; i++){
                spiral.add(matrix[m++][i]);
            }
            for (int i = 0; i < m-1; i++){
                spiral.add(matrix[i][n++]);
            }
        }


        return spiral;

    }

    public static void main(String args[]) {


    }
}