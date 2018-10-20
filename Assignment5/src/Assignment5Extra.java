import java.util.*;
public class Assignment5Extra {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result = new ArrayList<Integer>();
        if(matrix==null||matrix.length==0||matrix[0]==null){return result;}
        int m = matrix.length;
        int n = matrix[0].length;
        int tm = (int)((double)m/2+ 0.5);
        int tn = (int)((double)n/2+ 0.5);
        int starti,endi,startj,endj;
        for(starti = 0,startj=0;starti<tm&&startj<tn;starti++,startj++){
            endi = m-1-starti;
            endj = n-1-startj;
            int i ,j;
            for(i = starti,j=startj;j<=endj;j++){
                result.add(matrix[i][j]);
            }
            for(i = starti+1,j=endj;i<=endi;i++){
                result.add(matrix[i][j]);
            }
            if(endi!=starti)
                for(i = endi,j=endj-1;j>=startj;j--){
                    result.add(matrix[i][j]);
                }
            if(endj!=startj)
                for(i = endi-1,j=startj;i>=starti+1;i--){
                    result.add(matrix[i][j]);
                }
        }
        return result;
    }
}