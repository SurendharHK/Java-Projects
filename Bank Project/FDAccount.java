package Bankingg;

public class FDAccount extends Account{
    protected int period;

    FDAccount(int accno,int period,double amt)
    {
        super(accno,amt);
        this.period = period;
        System.out.println("your fd account is created with acc no: "+getAccountNo()+" with customer id:  "+Customer.cust_id +" with deposit of "+getBalance());
        Customer.cust_id=Customer.cust_id+1;
    }
    public int calc_interest()
    {
        double interest = (getBalance()*8.25)/(100*12);
        return (int)interest;

    }
    public void close()
    {

        System.out.println("your amount"+getBalance()+"interset amount"+calc_interest());
        setBalance(getBalance()+calc_interest());
        System.out.println("total amount"+getBalance());
    }
}
