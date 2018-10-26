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
}
