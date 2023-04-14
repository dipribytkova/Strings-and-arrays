package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long averageSalesAmount(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberOfMonthsOfSalesBelowAverage(long[] sales) {
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

    public int numberOfMonthsOfSalesAboveAverage(long[] sales) {
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

}
