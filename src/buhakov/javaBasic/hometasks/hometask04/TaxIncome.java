package buhakov.javaBasic.hometasks.hometask04;

import java.util.Scanner;

public class TaxIncome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write your income to get an amount taxes: ");

        int income = sc.nextInt();
        double clearIncome;
        double taxResult;
        double lowTaxRate = 2.5;
        double midTaxRate = 4.3;
        double highTaxRate = 6.7;

        if (income <= 10000) {
            taxResult = (income * lowTaxRate) / 100;
        } else if (income > 10001 && income <= 25000){
            taxResult = (income * midTaxRate) / 100;
        } else {
            taxResult = (income * highTaxRate) / 100;
        }

        clearIncome = income - taxResult;
        System.out.println("Your tax amount of " + income + " is " + taxResult + "." +
                "\nYour clear income is: " + clearIncome + ".");

        sc.close();
    }
}