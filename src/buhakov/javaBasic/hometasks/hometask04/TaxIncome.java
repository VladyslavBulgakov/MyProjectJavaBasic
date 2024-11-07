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
            taxResult = Math.round(income * lowTaxRate) / 100.00;
        } else if (income <= 25000){
            taxResult = Math.round(income * midTaxRate) / 100.00;
        } else {
            taxResult = Math.round(income * highTaxRate) / 100.00;
        }

        clearIncome = Math.round((income - taxResult) * 100) / 100.00;
        System.out.println("Your tax amount of " + income + " is " + taxResult + "." +
                "\nYour clear income is: " + clearIncome + ".");
        sc.close();
    }
}