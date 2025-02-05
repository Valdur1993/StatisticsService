package ru.netology.stats;

public class StatsService {
    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long calculateAverageSale(long[] sales) {
        return calculateTotalSale(sales) / sales.length;
    }

    public int calculateMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }

        }
        return monthMaximum + 1;
    }

    public int calculateMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i > sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }

        }
        return monthMinimum + 1;
    }

    public int calculateMonthsBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }

        }
        return counter;
    }

    public int calculateMonthsAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }

        }
        return counter;
    }
}


