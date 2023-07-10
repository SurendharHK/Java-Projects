package Bankingg;

public class SBAccount extends Account{
    SBAccount(int accNo,double bal )
    {
        super(accNo,bal);
        System.out.println("your savings account created with acc no: "+accNo +" with customer id: "+Customer.cust_id +" with initial balance "+bal);
        Customer.cust_id=Customer.cust_id+1;
    }
    public void deposit(double amt)
    {
        if(amt>0)
        {
            setBalance(getBalance()+amt);
            System.out.println(amt+"amt deposited to your account");
            System.out.println("your current balance"+getBalance());
        }
        else {
            System.out.println("enter valid amount");

        }
    }
    public void withdraw(double amt)
    {
        if(getBalance()-amt>1000)
        {
            setBalance(getBalance()-amt);
            System.out.println(amt+"is debited");
            System.out.println("your current balance is"+getBalance());
        }
        else {
            System.out.println("insufficient balance");
        }
    }
    public void calc_interest()
    {
        double interest = (getBalance()*4)/(100*12);
        System.out.println("your interset rate for 1 year"+interest +"for your balance"+getBalance());
        setBalance(getBalance()+interest);
        System.out.println("your current balance is"+getBalance());
    }
}
