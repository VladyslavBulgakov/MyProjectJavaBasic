package buhakov.javaBasic.hometasks.hometask03;

public class TotalSales {
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {
        int productNum = 1;
        String productName = "smartphone";
        int days = 5;
//        double salesByDay = 2430.68;
        double totalSales = 12153.4;
        double salesPerDay = totalSales / days;

        System.out.printf("Product No %d: %s\n", productNum, productName);
        System.out.printf("total sales for %s days is %.1f,\n", CURRENCY, totalSales);
        System.out.printf("sales by day is %s %.2f.", CURRENCY, salesPerDay);


        productNum++;
        productName = "laptop";
        days = 7;
//        salesByDay = 1498.12;
        totalSales = 10486.85;
        salesPerDay = totalSales / days;

        System.out.printf("\nProduct No %d: %s\n", productNum, productName);
        System.out.printf("total sales for %s days is %.2f,\n", CURRENCY, totalSales);
        System.out.printf("sales by day is %s %.2f.", CURRENCY, salesPerDay);
    }
}
