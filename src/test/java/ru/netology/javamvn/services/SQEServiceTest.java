package ru.netology.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQEServiceTest {

    @ParameterizedTest
    @CsvSource({
            "5,150,300"
    })
    public void shouldSqrExact(int expected, int minSqr, int maxSqr) {
        SQRService Service = new SQRService();
        {

            minSqr = 150;
            maxSqr = 300;

            int actual = Service.SqrService(minSqr, maxSqr);

            Assertions.assertEquals(expected, actual);
        }
    }
}



