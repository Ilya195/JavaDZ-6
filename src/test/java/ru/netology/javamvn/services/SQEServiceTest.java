package ru.netology.javamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQEServiceTest {

    @ParameterizedTest
    @CsvSource({
            "10,150,300",
            "11,150,300",
            "12,150,300",
            "13,150,300",
            "14,150,300",
            "15,150,300",
            "16,150,300"

    })
    public void shouldSqrExact(int expected, int x, int y) {
        SQRService Service = new SQRService();

        int actual = Service.SqrService( 150, 300);

        Assertions.assertEquals(expected, actual);

    }
}



