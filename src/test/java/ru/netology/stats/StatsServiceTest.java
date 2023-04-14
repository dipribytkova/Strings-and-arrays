package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void totalSaleTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmountTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long length = 12;
        long actual = service.averageSalesAmount(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long length = 12;
        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long length = 12;
        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsOfSalesBelowAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.numberOfMonthsOfSalesBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsOfSalesAboveAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.numberOfMonthsOfSalesAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}