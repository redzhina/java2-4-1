package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        long [] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(values);

        assertEquals(expected, actual);

    }

    @Test
    void calculateAverage() {
        StatsService service = new StatsService();

        long [] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverage(values);

        assertEquals(expected, actual);

    }

}
