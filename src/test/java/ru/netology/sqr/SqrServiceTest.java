package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldSqr() {
        SqrService sqrService = new SqrService();
        int expected = 3;
        int actual = sqrService.sqr(200, 300);
        assertEquals(expected, actual);

    }

}