package com.ClassesAndObjectsExamples;

import java.util.Scanner;

public class Task6Question5 {
    private static int count;

    public static void main(String[] args) {
        AddAmount add = new AddAmount();
        System.out.println("Initial amount in the savings box is : " + add.getAmount());
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you wish to do? \n------------------------------------------------------------");
        while (flag) {
            System.out.println("1. Add amount to savingx box:\n2. View number of transactions made so far:");
            int select = scan.nextInt();
            if (select == 1) {
                noOfTransactionsMade();
                System.out.println("How much do you want to add to the savings box? : ");
                AddAmount add1 = new AddAmount(scan.nextFloat());
                System.out.println("The final amount in the savings box is " + add1.getAmount());
            } else if (select == 2) {
                System.out.println("Number of Transactions made so far is : " + count);
            } else {
                System.exit(0);
            }
            System.out.println("Do you wish to continue ? (y/n)");
            if (scan.next().equalsIgnoreCase("y"))
                continue;
            else
                System.exit(0);
        }
    }

    public static int noOfTransactionsMade() {
        return count++;
    }
}

class AddAmount {
    private static double amount;

    static {
        amount = 50.0;
    }

    public AddAmount() {

    }

    public AddAmount(double amount) {
        this.amount = amount + this.amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
