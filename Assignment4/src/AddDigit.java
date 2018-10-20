public class AddDigit {
    // interesting
    public int addDigit(int n) {
        return 1 + (n - 1) % 9;
    }

        public static void main (String args[]) {
        AddDigit A1 = new AddDigit();
        int number = 38;
        int out = A1.addDigit(number);
        System.out.println(out);
    }
}

