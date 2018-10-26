public class CheckingAccount extends Account {
    static private double MinBalance = 100;
    static private double Fee = 10;

    public CheckingAccount(String fname, String lname, double cb){
        super(fname,lname,cb);
    }

    public double DebitTransaction(double debitAmount){
        super.DebitTransaction(debitAmount);
        ChargeFee();
        return CurBalance;
    }

    public double CreditTransaction(double creditAmount){
        super.CreditTransaction(creditAmount);
        ChargeFee();
        return CurBalance;
    }

    private void ChargeFee(){
        if (CurBalance < MinBalance){
            CurBalance -= Fee;
        }
    }

    public static void main (String args[]){
        CheckingAccount c1 = new CheckingAccount("Dave", "Franco", 50);
        System.out.println(c1);
        c1.DebitTransaction(0.71);
        System.out.println(c1);
        c1.CreditTransaction(41);
        System.out.println(c1);
        c1.CreditTransaction(101);
        System.out.println(c1);
    }
}
