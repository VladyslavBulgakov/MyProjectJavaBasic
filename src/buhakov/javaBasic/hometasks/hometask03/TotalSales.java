package buhakov.javaBasic.hometasks.hometask03;

public class TotalSales {
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {
        int productNum = 1;
        String productName = "smartphone";
        int days = 5;
//        double salesByDay = 2430.68;
        double totalSales = 12153.41;
        double result = totalSales / days;

        System.out.printf("Product No " + productNum + ": " + productName + ",\n"
                + "total sales for " + days + " days is " + CURRENCY + " %.2f" + ",\n"
                + "sales by day is " + CURRENCY + " %.2f.", totalSales, result
        );

        productNum++;
        productName = "laptop";
        days = 7;
//        salesByDay = 1498.12;
        totalSales = 10486.85;
        result = totalSales / days;

        System.out.printf("\nProduct No " + productNum + ": " + productName + ",\n"
                + "total sales for " + days + " days is " + CURRENCY + " %.2f" + ",\n"
                + "sales by day is " + CURRENCY + " %.2f.", totalSales, result
        );
    }
}
