package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void testFindingMultSqr(int expected, int lowRange, int upRange) {
        SQRService service = new SQRService();

        int actual = service.calc(lowRange, upRange);

        Assertions.assertEquals(expected, actual);
    }
}
