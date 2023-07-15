package Bankingg;

import java.util.Scanner;

public class Customer {
    protected static int cust_id=0;
    protected String name;
    protected String address;
    protected SBAccount sbAccount;
    protected FDAccount fdAccount;
    protected static int accno=1101;

    Scanner sc = new Scanner(System.in);


    public Customer( String name, String address) {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;



    }
    public void createAccount(int type)
    {
        if(type==0) {
            System.out.println("enter amt for first time deposit");
            double amount = sc.nextDouble();
            sbAccount = new SBAccount(accno, amount);
            accno++;
        }

        else if (type==1) {
            System.out.println("enter fixed deposit amount and period");
            double amount = sc.nextDouble();
            int period = sc.nextInt();
            fdAccount = new FDAccount(accno,period,amount);


        }
    }
    public void transaction(int type)
    {

        if(type==0)
        {
            System.out.println("enter 1 for deposit");
            System.out.println("enter 2 for withdraw");
            System.out.println("enter 3 for check intrest");
            int choice = sc.nextInt();
            if(choice==1)
            {
                System.out.println("enter amount to be deposit");
                double amt = sc.nextDouble();

                sbAccount.deposit(amt);

            }
            else if(choice==2)
            {
                System.out.println("enter amount to be withdraw");
                double amt = sc.nextDouble();
                sbAccount.withdraw(amt);
            }
            else if(choice==3)
            {
                sbAccount.calc_interest();
            }
            else
                System.out.println("enter valid choice");
        }
        else if(type==1)
        {
            System.out.println("enter 1 for closing for fd account");
            int choice = sc.nextInt();
            if(choice==1)
            fdAccount.close();
            else System.out.println("enter valid choice");

        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sbAccount=" + sbAccount +
                ", fdAccount=" + fdAccount +
                '}';
    }
}

