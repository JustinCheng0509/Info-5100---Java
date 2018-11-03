public class MyIndexOutOfBoundException extends IndexOutOfBoundsException {
    private int lowerBound;
    private int upperBound;
    private int index;

    public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index){
        this.lowerBound=lowerBound;
        this.upperBound=upperBound;
        this.index=index;
    }

    public String toString(){
        return "Error Message: Index:" + index
                + ", but Lower bound: " + lowerBound
                + ", Upper bound: " + upperBound;
    }

    public boolean outOfBounds(){
        if (this.index < this.lowerBound || this.index>this.upperBound){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws MyIndexOutOfBoundException{
        MyIndexOutOfBoundException test = new MyIndexOutOfBoundException(0,9,10);
        if (test.outOfBounds()){
            throw test;
        }
    }
}
