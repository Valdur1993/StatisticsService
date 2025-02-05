package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testTotalSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actul = service.calculateTotalSale(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actul);
    }

    @Test
    public void testAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actul = service.calculateAverageSale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actul);
    }

    @Test
    public void testMonthMaximum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actul = service.calculateMonthMaximumSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actul);
    }

    @Test
    public void testMonthMinimum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actul = service.calculateMonthMinimumSale(sales);
        long expected = 1;

        Assertions.assertEquals(expected, actul);
    }

    @Test
    public void testMonthsBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actul = service.calculateMonthsBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actul);
    }

    @Test
    public void testMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actul = service.calculateMonthsAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actul);
    }

}
