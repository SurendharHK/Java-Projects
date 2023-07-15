package Bankingg.demo;
import Bankingg.FDAccount;
import Bankingg.SBAccount;
import Bankingg.Customer;
import Bankingg.Account;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Customer customer[] = new Customer[5];
        int custId = 0;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("enter 1-------create account");
            System.out.println("enter 2------transaction");
            System.out.println("enter 3------show all customers");
            System.out.println("enter 4----exit");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            switch (choice) {


                case 1:

                {
                    System.out.println("enter name and address");
                    String name = sc.next();
                    String address = sc.next();
                    customer[custId] = new Customer(name,address);

                    System.out.println("enter 0----creating for savings account");
                    System.out.println("enter 1-----creating for fd account");
                    int type =sc.nextInt();
                    customer[custId].createAccount(type);
                    custId++;

                }
                break;
                case 2:
                {
                    System.out.println("enter 0-----for savings account transaction ");
                    System.out.println("enter 1-----for fd transaction");
                    int typ = sc.nextInt();
                    System.out.println("enter customer id");
                    int aid = sc.nextInt();
                    customer[aid].transaction(typ);


                }
                break;
                case 3:
                {
                    for(Customer k:customer)
                    { if(k!=null)
                        System.out.println(k);
                    }
                }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid choice");

                    break;
            }


        } while (choice != 4);


    }
}
