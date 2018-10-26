public class Account {
    protected String FirstName, LastName;
    protected double CurBalance;

    public Account(String fname, String lname, double cb){
        FirstName = fname; LastName = lname; CurBalance = cb;
    }
    public String getAcctType(){
        return this.getClass().getName();
    }

    public double DebitTransaction(double debitAmount){
        CurBalance -= debitAmount;
        return CurBalance;
    }

    public double CreditTransaction(double creditAmount){
        CurBalance += creditAmount;
        return CurBalance;
    }

    @Override
    public String toString() {
        return "Account name: "+FirstName+" "+LastName+", Account Type: "+ getAcctType()+", Balance: "+ String.format("$%.2f", CurBalance);
    }

    public static void main (String args[]){
        Account a1 = new Account("James","Franco",450);
        System.out.println(a1);

        a1.DebitTransaction(71.74);
        System.out.println(a1);

        a1.CreditTransaction(67.14);
        System.out.println(a1);
    }
}
