public class PushZero {
    public void pushZero(int[] num){
        int n = num.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] != 0) {
                num[count] = num[i];
                count++;
            }
        }
        while (count < n){
            num[count] = 0;
            count++;
        }
    }

    public void displayArray(int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main (String args[]){
        int array[] = {0,0,0,3,71,11,2,3,4,0,5,6,0,3,4,2,0,0,2,3};
        PushZero p1 = new PushZero();
        p1.pushZero(array);
        p1.displayArray(array);
        /*for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }*/
        //System.out.println(3/23.32);
    }
}
